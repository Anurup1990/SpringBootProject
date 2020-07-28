package com.cts.pss.service;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

public class SearchQuery {

	private String flightNumber;
    private String origin;
    private String destination;
    private LocalDate flightDate;
    private LocalTime flightTime;
    private int numberofPassengers;
    
   
	public SearchQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public SearchQuery(String flightNumber, String origin, String destination, LocalDate flightDate,
			LocalTime flightTime, int numberofPassengers) {
		super();
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.flightDate = flightDate;
		this.flightTime = flightTime;
		this.numberofPassengers = numberofPassengers;
	}


	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}
	public LocalTime getFlightTime() {
		return flightTime;
	}
	public void setFlightTime(LocalTime flightTime) {
		this.flightTime = flightTime;
	}
	public int getNumberofPassengers() {
		return numberofPassengers;
	}
	public void setNumberofPassengers(int numberofPassengers) {
		this.numberofPassengers = numberofPassengers;
	}
	@Override
	public String toString() {
		return "SearchQuery [flightNumber=" + flightNumber + ", origin=" + origin + ", destination=" + destination
				+ ", flightDate=" + flightDate + ", flightTime=" + flightTime + ", numberofPassengers="
				+ numberofPassengers + "]";
	}

    
}
