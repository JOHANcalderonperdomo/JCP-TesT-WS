package com.sena.TesT_WS.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="schedules")
public class Schedules extends AbaseEntity{
	
	@Column(name="date", length = 45, nullable = false)
	private Date date;
	
	@Column(name="time", length = 45, nullable = false)
	private String time;
	
	@Column(name="economyprice", length = 45, nullable = false)
	private String economyprice;
	
	@Column(name="confirmed", length = 45, nullable = false)
	private String confirmed;

	@Column(name="flightnumber", length = 45, nullable = false)
	private String flightnumber;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="aircrafts", nullable = false)
	public Airports aircrafts;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="route", nullable = false)
	public Airports route;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getEconomyprice() {
		return economyprice;
	}

	public void setEconomyprice(String economyprice) {
		this.economyprice = economyprice;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}

	public Airports getAircrafts() {
		return aircrafts;
	}

	public void setAircrafts(Airports aircrafts) {
		this.aircrafts = aircrafts;
	}

	public Airports getRoute() {
		return route;
	}

	public void setRoute(Airports route) {
		this.route = route;
	}
}
