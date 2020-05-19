package org.sci.controller;

import java.util.List;

import org.sci.model.Branch;
import org.sci.model.Region;
import org.sci.repo.BranchRepo;
import org.sci.repo.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/topup/reg-branch")
public class BranchInfoController {

	@Autowired
	private RegionRepository repo;
	@Autowired
	private BranchRepo branchRepo;
	@SuppressWarnings("static-access")
	@GetMapping(value="/getAllRegions")
public ResponseEntity<?> getAllRegion()
	{
		//JSONObject obj= new JSONObject();
	List<Region> regions=repo.findAll();	
		if(regions!=null)
		{
			return ResponseEntity.ok(regions);
		}
		else
		return ResponseEntity.noContent().build().ok("no contents");
		
	}
	@GetMapping(value="/getAllBranches/{reg_id}")
	public ResponseEntity<?> getAllBranches(@PathVariable String reg_id)
	{
	List <Branch> branches= branchRepo.findBranchById(reg_id);
			if(branches!=null)
		{
				
			return ResponseEntity.ok(branches);
		}
		else
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No response");
		
		
	}
	@GetMapping(value="/getAllBranches")
	public ResponseEntity<?> getAllBranches()
	{
		List <Branch> branches= branchRepo.findAll();
		if(branches!=null)
		{
			return ResponseEntity.ok(branches);
		}
		else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No response");
	
	}
	
}
