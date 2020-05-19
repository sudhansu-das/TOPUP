package org.sci.controller;

import org.json.JSONObject;
import org.sci.model.LoandetailsInfo;
import org.sci.repo.LoandetailsinfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class DocumentController
{
	@Autowired
	private LoandetailsinfoRepo repo;
	@GetMapping(value="/kycdetails/{acc_No}")
public ResponseEntity<?>getKYCDetails(@PathVariable ("acc_No")String acc_No)
{
	LoandetailsInfo object=repo.findByAcc_No(acc_No);
	if(object != null)
	return ResponseEntity.ok(object);
	else
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No response"); 
	
}
}
