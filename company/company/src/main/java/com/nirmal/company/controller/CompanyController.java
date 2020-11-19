package com.nirmal.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirmal.company.entities.Company;
import com.nirmal.company.entities.IPODetailEntity;
import com.nirmal.company.service.CompanyService;
import com.nirmal.company.service.IPODetailsService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CompanyController {

	private CompanyService companyService;
	private IPODetailsService ipoService;
	
	@Autowired
	public CompanyController(CompanyService companyService, IPODetailsService ipoService) {
		super();
		this.companyService = companyService;
		this.ipoService = ipoService;
	}
	
	@PostMapping("/addCompany")
	public ResponseEntity<Company> addCompany(@RequestBody Company company) {
		return new ResponseEntity<Company>(companyService.addCompany(company), HttpStatus.CREATED);
	}
	
	@GetMapping("/companies")
	public ResponseEntity<List<Company>> getAllCompanies() {
		return new ResponseEntity<List<Company>>(companyService.getAllCompanies(), HttpStatus.OK);
	}
	/*
	@GetMapping("/id/{companyId}")
	public ResponseEntity<Optional<IPODetailEntity>> getCompanyById(@PathVariable("companyId") int companyId) {
		Optional<IPODetailEntity> company = ipoService.getIpoDetailsById(companyId);
		return ResponseEntity.status(HttpStatus.FOUND).body(company);
	}*/
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<String>("Welcome from Companies", HttpStatus.OK);
	}
}
