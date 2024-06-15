package com.sena.TesT_WS.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users extends AbaseEntity{
	
	@Column(name="email", length = 45, nullable = false)
	private String email;
	
	@Column(name="password", length = 45, nullable = false)
	private String passeord;

	@Column(name="firstname", length = 45, nullable = false)
	private String firstname;
	
	@Column(name="lastname", length = 45, nullable = false)
	private String lastname;
	
	@Column(name="birthdate", length = 45, nullable = false)
	private Date birthdate;
	
	@Column(name="active", length = 45, nullable = false)
	private String active;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="role", nullable = false)
	public Roles role;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="office", nullable = false)
	public Offices office;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasseord() {
		return passeord;
	}

	public void setPasseord(String passeord) {
		this.passeord = passeord;
	}

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

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

	public Offices getOffice() {
		return office;
	}

	public void setOffice(Offices office) {
		this.office = office;
	}
}
