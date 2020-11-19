package com.nirmal.company.service;

import java.sql.Date;
import java.util.List;

import com.nirmal.company.entities.Company;

public interface SectorService {

	public float getSectorPrice(int sectorId);
	public float getSectorPrice(int sectorId, Date fromDate, Date toDate);
	public List<Company> getCompaniesInSector(String sectorName);
}
