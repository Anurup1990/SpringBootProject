package com.cts.pss.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Airline_info {

	@Id
	@GeneratedValue
	private int airlineId;
	private String airlineLogo;
	private String nameOfAirline;

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "Flights_info", joinColumns = {@JoinColumn(name ="airline_id")}, inverseJoinColumns = {@JoinColumn(name = "flight_infoid")})
	private List<Flight_info> flightInfo = new ArrayList<>();
	
	
	
	public Airline_info(String airlineLogo, String nameOfAirline) {
		super();
		this.airlineLogo = airlineLogo;
		this.nameOfAirline = nameOfAirline;
	}


	public int getAirlineId() {
		return airlineId;
	}


	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}


	public String getAirlineLogo() {
		return airlineLogo;
	}


	public void setAirlineLogo(String airlineLogo) {
		this.airlineLogo = airlineLogo;
	}


	public String getNameOfAirline() {
		return nameOfAirline;
	}


	public void setNameOfAirline(String nameOfAirline) {
		this.nameOfAirline = nameOfAirline;
	}


	public List<Flight_info> getFlightInfo() {
		return flightInfo;
	}


	public void setFlightInfo(List<Flight_info> flightInfo) {
		this.flightInfo = flightInfo;
	}


	public Airline_info() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Airline_info [airlineId=" + airlineId + ", airlineLogo=" + airlineLogo + ", nameOfAirline="
				+ nameOfAirline + ", flightInfo=" + flightInfo + ", getAirlineId()=" + getAirlineId()
				+ ", getAirlineLogo()=" + getAirlineLogo() + ", getNameOfAirline()=" + getNameOfAirline()
				+ ", getFlightInfo()=" + getFlightInfo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
