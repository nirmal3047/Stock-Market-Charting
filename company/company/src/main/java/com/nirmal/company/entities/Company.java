package com.nirmal.company.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	private int turnover;
	
	private String ceo;
	
	@Column(name="board_of_directors")
	private String boardOfDirectors;
	
	@Column(name="stock_exchanges")
	private String stockExchanges;
	
	@Column(name="sector", updatable=false)
	private String sector;
	
	@Column(name="brief_writeUp")
	private String briefWriteUp;
	
	@Column(name="company_stock_code")
	private String companyStockCode;
	
	protected Company() {}
	
	public Company(int id, String companyName, int turnover, String ceo, String boardOfDirectors,
			String stockExchanges, String sector, String briefWriteUp, String companyStockCode) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.stockExchanges = stockExchanges;
		this.sector = sector;
		this.briefWriteUp = briefWriteUp;
		this.companyStockCode = companyStockCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getTurnover() {
		return turnover;
	}

	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public String getStockExchanges() {
		return stockExchanges;
	}

	public void setStockExchanges(String stockExchanges) {
		this.stockExchanges = stockExchanges;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getBriefwriteup() {
		return briefWriteUp;
	}

	public void setBriefwriteup(String briefwriteup) {
		this.briefWriteUp = briefwriteup;
	}

	public String getCompanyStockCode() {
		return companyStockCode;
	}

	public void setCompanyStockCode(String companyStockCode) {
		this.companyStockCode = companyStockCode;
	}
	
}
