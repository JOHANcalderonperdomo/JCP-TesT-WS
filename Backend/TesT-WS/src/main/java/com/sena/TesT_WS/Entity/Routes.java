package com.sena.TesT_WS.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="routes")
public class Routes extends AbaseEntity{
	
	@Column(name="distance", length = 45, nullable = false)
	private String distance;
	
	@Column(name="flighttime", length = 45, nullable = false)
	private String flighttime;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="departureairport", nullable = false)
	public Airports departureairport;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="arrivalairport", nullable = false)
	public Airports arrivalairport;

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getFlighttime() {
		return flighttime;
	}

	public void setFlighttime(String flighttime) {
		this.flighttime = flighttime;
	}

	public Airports getDepartureairport() {
		return departureairport;
	}

	public void setDepartureairport(Airports departureairport) {
		this.departureairport = departureairport;
	}

	public Airports getArrivalairport() {
		return arrivalairport;
	}

	public void setArrivalairport(Airports arrivalairport) {
		this.arrivalairport = arrivalairport;
	}
}
