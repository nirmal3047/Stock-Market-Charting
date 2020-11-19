package com.nirmal.company.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sector {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="sector_name")
	private String sectorName;
	
	private String brief;
	
	protected Sector() {}

	public Sector(int id, String sectorName, String brief) {
		super();
		this.id = id;
		this.sectorName = sectorName;
		this.brief = brief;
	}

	public int getId() {
		return id;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	
}
