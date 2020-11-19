package com.nirmal.stockexchange.service;

import java.util.List;

import com.nirmal.stockexchange.entities.StockPriceEntity;

public interface StockPriceService {

	StockPriceEntity addStockPrice(StockPriceEntity stockPrice);
	public List<StockPriceEntity> findAllStockPrice();
	public List<StockPriceEntity> findStockPriceByCompanyCode(int companyCode);
}
