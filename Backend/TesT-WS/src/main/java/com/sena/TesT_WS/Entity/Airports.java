package com.sena.TesT_WS.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="airports")
public class Airports extends AbaseEntity{
	
	@Column(name="iatacode", length = 45, nullable = false)
	private String iatacode;
	
	@Column(name="name", length = 45, nullable = false)
	private String name;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="country", nullable = false)
	public Countries country;


	public String getIatacode() {
		return iatacode;
	}

	public void setIatacode(String iatacode) {
		this.iatacode = iatacode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Countries getCountry() {
		return country;
	}

	public void setCountry(Countries country) {
		this.country = country;
	}
}
