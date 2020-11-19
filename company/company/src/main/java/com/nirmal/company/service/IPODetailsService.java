package com.nirmal.company.service;

import java.util.Optional;

import com.nirmal.company.entities.IPODetailEntity;

public interface IPODetailsService {

	public Optional<IPODetailEntity> getIpoDetailsById(int id);
}
