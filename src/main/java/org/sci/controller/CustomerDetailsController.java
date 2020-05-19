package org.sci.controller;

import java.security.Principal;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.kie.internal.KnowledgeBase;
import org.kie.internal.runtime.StatelessKnowledgeSession;
import org.sci.model.Branch;
import org.sci.model.CustomerDetails;
import org.sci.model.Loanstatusdetails;
import org.sci.model.User;
import org.sci.repo.BranchRepo;
import org.sci.repo.CustomerDetailsRepo;

import org.sci.repo.Loanstatus;
import org.sci.repo.UserRepository;
import org.sci.util.DroolsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin("*")
public class CustomerDetailsController {

	@Autowired
	private UserRepository repo;
	@Autowired
	private Loanstatus lnrepo;
	@Autowired
	private BranchRepo branchRepo;	
	@Autowired
	private CustomerDetailsRepo custRepo;
	private static StatelessKnowledgeSession session;
	 List<CustomerDetails> list1= new ArrayList<>();
	@RequestMapping(value="/getBranchDetails/{branchId}")
	public ResponseEntity<?> getAllCustomerDetails( Principal principal,@PathVariable ("branchId")String branchId)
	{
		String role_Id="";
		String username=principal.getName();
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Set<String> roles = authentication.getAuthorities().stream()
			     .map(r -> r.getAuthority()).collect(Collectors.toSet());
		System.out.println("Roles are"+roles);
		Optional <User> optional=repo.findByUsername(username);
		User user=optional.get();
		role_Id=user.getRoleId();

	if((role_Id.equals("H-01")))
	{
		int QTR=0;
		List<Loanstatusdetails> list1=null;
		YearMonth test=YearMonth.now();
		String test1= test.toString();
		int curYear=Integer.parseInt(test1.substring(0, 4));
		int curMonth=Integer.parseInt(test1.substring(5, 7));
		System.out.println("*************"+curMonth);
		System.out.println("******************"+curYear);
	if(curMonth==1 || curMonth==2 ||curMonth==3)		
		QTR=1;	
	else if(curMonth==4 || curMonth==5 ||curMonth==6)
		QTR=2;
	else if(curMonth==7 || curMonth==8 ||curMonth==9)
		QTR=3;
	else
		QTR=4;
	
	list1=lnrepo.getAllRec(branchId,curYear,QTR);

	 System.out.println("********"+list1);
	
	if (list1.size()==0)
	{
		List <Loanstatusdetails> loanStatus1= new ArrayList<Loanstatusdetails>();
		Loanstatusdetails loanStatusObject;
//		KieSession kSession = null ;
		List<CustomerDetails> details = custRepo.findByBranchId(branchId);
		try
		{
			 KnowledgeBase knowledgeBase =DroolsUtil.createKnowledgeBaseFromSpreadsheet("personalloan.xls");
		       session = knowledgeBase.newStatelessKnowledgeSession();
			for(CustomerDetails dtls: details)
			{
				 session.execute(dtls);
				List<String> multiList=dtls.getMul_Loan_Type();
				for(String str:multiList)
				{
					System.out.println("***************"+dtls.getLoan_Amount());
					System.out.println("**topup*************"+dtls.getTopup_Eligible_Amount());
					loanStatusObject= new Loanstatusdetails();
					loanStatusObject.setAccID(dtls.getAcc_No());
					loanStatusObject.setBank_Rel(dtls.getBank_Rel());
					loanStatusObject.setBranch_Id(dtls.getBranchId());
					loanStatusObject.setFirstName(dtls.getCust_Name());
					loanStatusObject.setLoanType(str);
					loanStatusObject.setMobile(dtls.getMobile());
					loanStatusObject.setMail_Id(dtls.getMail_Id());
					loanStatusObject.setQtr(QTR);
					loanStatusObject.setYear(curYear);
					loanStatusObject.setTop_Up_Loan_Amount(dtls.getPer_Amount_Deserve());
					loanStatus1.add(loanStatusObject);
					lnrepo.save(loanStatusObject);
				}
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	
	}
		list1=lnrepo.getAllRec(branchId,curYear,QTR);
		 System.out.println("********"+list1);
			return ResponseEntity.ok(list1);
	}
	
	else
		return ResponseEntity.badRequest().body("There is no Permission For You.");

	}
	@GetMapping(value="/getInfoId/{accNo}")
	public ResponseEntity<?> getInfoId(@PathVariable String accNo)
	{
		CustomerDetails cust= custRepo.finByAcc_No(accNo);
		if(cust!=null)
		{
			return ResponseEntity.ok(cust);
		}
		else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No response");
	
		
	}
}

