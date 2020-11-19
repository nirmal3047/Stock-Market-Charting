package com.nirmal.stockexchange.entities;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="stock_price_entity")
public class StockPriceEntity {

	@Id
	private int stockPriceId;
	
	private int companyCode;
	
	//@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    //@JoinColumn(name="stock_exchange")
	@Column(name="stock_exchange")
	private String stockExchange;
	
	@Column(name="current_price")
	private float currentPrice;
	private Date date;
	private Time time;
	
	public StockPriceEntity() {}
	
	public StockPriceEntity(int stockPriceId,int companyCode, String stockExchange, float currentPrice, Date date, Time time)
	{
		super();
		this.stockPriceId = stockPriceId;
		this.companyCode = companyCode;
		this.stockExchange = stockExchange;
		this.currentPrice = currentPrice;
		this.date = date;
		this.time = time;
	}
	
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public float getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
}
