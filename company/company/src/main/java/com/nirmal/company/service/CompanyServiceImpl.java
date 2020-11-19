package com.nirmal.company.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmal.company.entities.Company;
import com.nirmal.company.repository.CompanyDao;

@Service
public class CompanyServiceImpl implements CompanyService {

	private CompanyDao companyDao;
	
	@Autowired
	public CompanyServiceImpl(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}

	@Override
	@Transactional
	public Optional<Company> getCompanyById(int id) {
		return companyDao.findById(id);
	}

	@Override
	@Transactional
	public List<Company> getAllCompanies() {
		return companyDao.findAll();
	}

	@Override
	@Transactional
	public List<Company> getCompanyListInSector(String sector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Company addCompany(Company company) {
		return companyDao.save(company);
	}

}
