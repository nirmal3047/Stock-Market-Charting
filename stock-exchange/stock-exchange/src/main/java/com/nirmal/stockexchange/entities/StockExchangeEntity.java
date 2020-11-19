package com.nirmal.stockexchange.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock_exchange_entity")
public class StockExchangeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="stock_exchange")
	private String stockExchange;
	
	private String brief;
	
	@Column(name="contact_address")
	private String contactAddress;
	
	private String remarks;
	
	protected StockExchangeEntity() {}
	
	public StockExchangeEntity(int id, String stockExchange, String brief, String contactAddress, String remarks){
		super();
		this.id = id;
		this.stockExchange = stockExchange;
		this.brief = brief;
		this.contactAddress = contactAddress;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
