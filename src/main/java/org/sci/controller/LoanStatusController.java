package org.sci.controller;

import org.sci.model.AccountInfo;
import org.sci.repo.Loanstatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class LoanStatusController {
	@Autowired
 private Loanstatus lnstatus;
	
	@GetMapping("/getAllAccountInfo")
	public ResponseEntity<?>getAllAccountInfo()
	{
		int totcontacted=lnstatus.getAllContacted(true, true);
		int totGen=lnstatus.getAllGenerated();
		int totInter=lnstatus.getAllInterested(true);
		int totNotInterested=lnstatus.getTotNotInterested(true);
		int totLoanConv=lnstatus.totConvertedToLoan();
		AccountInfo info= new AccountInfo();
		info.setTotCont(totcontacted);
		info.setTotCoverted(totLoanConv);
		info.setTotInter(totInter);
		info.setTotNotInter(totNotInterested);
		info.setTotGen(totGen);
		if(info.getTotCont()!=0)
		return ResponseEntity.ok(info);
		else 
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No response"); 
		
	}
}
