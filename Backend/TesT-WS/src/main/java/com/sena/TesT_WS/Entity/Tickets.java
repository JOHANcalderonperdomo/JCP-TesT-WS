package com.sena.TesT_WS.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tickets")
public class Tickets extends AbaseEntity{
	
	@Column(name="firstname", length = 45, nullable = true)
	private String firstname;
	
	@Column(name="lastname", length = 45, nullable = true)
	private String lastname;
	
	@Column(name="email", length = 45, nullable = true)
	private String email;
	
	@Column(name="phone", length = 45, nullable = true)
	private String phone;
	
	@Column(name="passportnumber", length = 45, nullable = true)
	private String passportnumber;
	
	@Column(name="passportphoto", length = 45, nullable = true)
	private String passportphoto;
	
	@Column(name="bookingreference", length = 45, nullable = true)
	private String bookingreference;
	
	@Column(name="confirmed", length = 45, nullable = true)
	private String confirmed;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name="user", nullable = true)
	public Users user;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name="schedules", nullable = true)
	public Schedules schedules;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name="cabintypes", nullable = true)
	public CabinTypes cabintypes;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name="countries", nullable = true)
	public Countries countries;
	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassportnumber() {
		return passportnumber;
	}

	public void setPassportnumber(String passportnumber) {
		this.passportnumber = passportnumber;
	}

	public String getPassportphoto() {
		return passportphoto;
	}

	public void setPassportphoto(String passportphoto) {
		this.passportphoto = passportphoto;
	}

	public String getBookingreference() {
		return bookingreference;
	}

	public void setBookingreference(String bookingreference) {
		this.bookingreference = bookingreference;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Schedules getSchedules() {
		return schedules;
	}

	public void setSchedules(Schedules schedules) {
		this.schedules = schedules;
	}

	public CabinTypes getCabintypes() {
		return cabintypes;
	}

	public void setCabintypes(CabinTypes cabintypes) {
		this.cabintypes = cabintypes;
	}

	public Countries getCountries() {
		return countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	
}
