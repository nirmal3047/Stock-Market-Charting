package com.nirmal.company.service;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmal.company.entities.Company;
import com.nirmal.company.repository.SectorDao;

@Service
public class SectorServiceImpl implements SectorService {

	private SectorDao sectorDao;
	
	@Autowired
	public SectorServiceImpl(SectorDao sectorDao) {
		super();
		this.sectorDao = sectorDao;
	}

	@Override
	@Transactional
	public float getSectorPrice(int sectorId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public float getSectorPrice(int sectorId, Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Company> getCompaniesInSector(String sectorName) {
		// TODO Auto-generated method stub
		return null;
	}

}
