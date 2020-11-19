package com.nirmal.company.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ipo_detail")
public class IPODetailEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="stock_exchange")
	private String stockExchange;
	
	@Column(name="price_per_share")
	private float pricePerShare;
	
	@Column(name="total_number_of_shares")
	private int totalNumberOfShares;
	
	@Column(name="open_date_time")
	private Date openDateTime;

	public IPODetailEntity(int id, String companyName, String stockExchange, float pricePerShare,
			int totalNumberOfShares, Date openDateTime) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.stockExchange = stockExchange;
		this.pricePerShare = pricePerShare;
		this.totalNumberOfShares = totalNumberOfShares;
		this.openDateTime = openDateTime;
	}

	protected IPODetailEntity() {}
	
	public int getId() {
		return id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public float getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(float pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	public int getTotalNumberOfShares() {
		return totalNumberOfShares;
	}

	public void setTotalNumberOfShares(int totalNumberOfShares) {
		this.totalNumberOfShares = totalNumberOfShares;
	}

	public Date getOpenDateTime() {
		return openDateTime;
	}

	public void setOpenDateTime(Date openDateTime) {
		this.openDateTime = openDateTime;
	}
	
}
