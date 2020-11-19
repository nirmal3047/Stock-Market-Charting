package com.nirmal.stockexchange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirmal.stockexchange.service.StockExchangeService;
import com.nirmal.stockexchange.service.StockPriceService;
import com.nirmal.stockexchange.entities.StockExchangeEntity;
import com.nirmal.stockexchange.entities.StockPriceEntity;

@RestController
@RequestMapping("/api")
public class StockController {

	private StockExchangeService stockExchangeService;
	private StockPriceService stockPriceService;
	
	@Autowired
	public StockController(StockExchangeService stockExchangeService, StockPriceService stockPriceService) {
		super();
		this.stockExchangeService = stockExchangeService;
		this.stockPriceService = stockPriceService;
	}
	
	@GetMapping("/exchangeList")
	public ResponseEntity<List<StockExchangeEntity>> getStockExchangesList() {
		return new ResponseEntity<List<StockExchangeEntity>>(stockExchangeService.getStockExchangesList(), HttpStatus.OK);
	}
	
	//Correct it
	@PostMapping("/add/{exchangeList}")
	public ResponseEntity<List<StockExchangeEntity>> addStockExchanges() {
		return new ResponseEntity<List<StockExchangeEntity>>(stockExchangeService.getStockExchangesList(), HttpStatus.OK);
	}
	
	@GetMapping("/CompanyList")
	public ResponseEntity<List<StockExchangeEntity>> getComapnyList() {
		return new ResponseEntity<List<StockExchangeEntity>>(stockExchangeService.getStockExchangesList(), HttpStatus.OK);
	}
	
	@PostMapping("/addStockPrice")
	public ResponseEntity<StockPriceEntity> addStockPrice(@RequestBody StockPriceEntity stockPrice) {
		return new ResponseEntity<StockPriceEntity>(stockPriceService.addStockPrice(stockPrice), HttpStatus.CREATED);
	}
	
	@GetMapping("/stockPriceByCompany/{companyCode}")
	public ResponseEntity<List<StockPriceEntity>> findStockPriceByCompanyCode(@PathVariable("companyCode") String companyCode) {
		return null;
	}
}
