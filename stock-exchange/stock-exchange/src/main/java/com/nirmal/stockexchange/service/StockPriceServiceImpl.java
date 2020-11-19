package com.nirmal.stockexchange.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmal.stockexchange.entities.StockPriceEntity;
import com.nirmal.stockexchange.repository.StockPriceDao;

@Service
public class StockPriceServiceImpl implements StockPriceService{

	private StockPriceDao stockPriceDao;

	@Autowired
	public StockPriceServiceImpl(StockPriceDao stockPriceDao) {
		super();
		this.stockPriceDao = stockPriceDao;
	}

	@Override
	@Transactional
	public StockPriceEntity addStockPrice(StockPriceEntity stockPrice) {
		return stockPriceDao.save(stockPrice);
	}
	
	@Override
	@Transactional
	public List<StockPriceEntity> findAllStockPrice() {
		return stockPriceDao.findAll();
	}

	@Override
	public List<StockPriceEntity> findStockPriceByCompanyCode(int companyCode) {
		return stockPriceDao.findByCompanyCode(companyCode);
	}
}
