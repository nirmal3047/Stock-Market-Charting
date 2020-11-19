package com.nirmal.company.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmal.company.entities.IPODetailEntity;
import com.nirmal.company.repository.IPODetailEntityDao;

@Service
public class IPODetailsServiceImpl implements IPODetailsService {

	private IPODetailEntityDao ipoDetail;
	
	@Autowired
	public IPODetailsServiceImpl(IPODetailEntityDao ipoDetail) {
		super();
		this.ipoDetail = ipoDetail;
	}

	@Override
	@Transactional
	public Optional<IPODetailEntity> getIpoDetailsById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
