package com.nirmal.company.service;

import java.util.List;
import java.util.Optional;

import com.nirmal.company.entities.Company;

public interface CompanyService {

	public Optional<Company> getCompanyById(int id);
	public List<Company> getAllCompanies();
	public List<Company> getCompanyListInSector(String sector);
	public Company addCompany(Company company);
}
