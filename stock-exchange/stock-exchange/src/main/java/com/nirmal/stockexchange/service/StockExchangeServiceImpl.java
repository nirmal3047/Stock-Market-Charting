package com.nirmal.stockexchange.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmal.stockexchange.entities.StockExchangeEntity;
import com.nirmal.stockexchange.repository.StockExchangeDao;

@Service
public class StockExchangeServiceImpl implements StockExchangeService {

	private StockExchangeDao stockExchangeDao;
	
	@Autowired
	public StockExchangeServiceImpl(StockExchangeDao stockExchangeDao) {
		super();
		this.stockExchangeDao = stockExchangeDao;
	}

	@Override
	@Transactional
	public List<StockExchangeEntity> getStockExchangesList() {
		return stockExchangeDao.findAll();
	}

	@Override
	@Transactional
	public StockExchangeEntity addStockExchange(StockExchangeEntity stockExchange) {
		// TODO Auto-generated method stub
		return null;
	}

}
