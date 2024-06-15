package com.sena.TesT_WS.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="offices")
public class Offices extends AbaseEntity{
	
	@Column(name="title", length = 45, nullable = false)
	private String title;
	
	@Column(name="phone", length = 45, nullable = false)
	private int phone;
	
	@Column(name="contact", length = 45, nullable = false)
	private String contact;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="country", nullable = false)
	public Countries country;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Countries getCountry() {
		return country;
	}

	public void setCountry(Countries country) {
		this.country = country;
	}
	
}
