package com.sena.TesT_WS.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="aircrafts")
public class Aircrafts extends AbaseEntity{
	
	@Column(name="name", length = 45, nullable = false)
	private String name;
	
	@Column(name="makemodel", length = 45, nullable = false)
	private String makelmodel;
	
	@Column(name="totalseats", length = 45, nullable = false)
	private String totalseats;
	
	@Column(name="economyseats", length = 45, nullable = false)
	private String economyseats;
	
	@Column(name="businessseats", length = 45, nullable = false)
	private String businessseats;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMakelmodel() {
		return makelmodel;
	}

	public void setMakelmodel(String makelmodel) {
		this.makelmodel = makelmodel;
	}

	public String getTotalseats() {
		return totalseats;
	}

	public void setTotalseats(String totalseats) {
		this.totalseats = totalseats;
	}

	public String getEconomyseats() {
		return economyseats;
	}

	public void setEconomyseats(String economyseats) {
		this.economyseats = economyseats;
	}

	public String getBusinessseats() {
		return businessseats;
	}

	public void setBusinessseats(String businessseats) {
		this.businessseats = businessseats;
	}
}
