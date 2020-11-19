package com.nirmal.stockexchange.service;

import java.util.List;

import com.nirmal.stockexchange.entities.StockExchangeEntity;

public interface StockExchangeService {

	public List<StockExchangeEntity> getStockExchangesList();
	public StockExchangeEntity addStockExchange(StockExchangeEntity stockExchange);
}
