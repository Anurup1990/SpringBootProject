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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

public class Flight_info {

	
	@Id
	@GeneratedValue
	private int flight_infoid;
	private String flight_number;
	private String flight_type;
	private int numberof_seats;
	

//	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	private Airline_info airline_info;
	
	
	public Flight_info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight_info(String flight_number, String flight_type, int numberof_seats) {
		super();
		this.flight_number = flight_number;
		this.flight_type = flight_type;
		this.numberof_seats = numberof_seats;
	}

	public int getFlight_infoid() {
		return flight_infoid;
	}
	public void setFlight_infoid(int flight_infoid) {
		this.flight_infoid = flight_infoid;
	}
	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}
	public String getFlight_type() {
		return flight_type;
	}
	public void setFlight_type(String flight_type) {
		this.flight_type = flight_type;
	}

	public int getNumberof_seats() {
		return numberof_seats;
	}
	public void setNumberof_seats(int numberof_seats) {
		this.numberof_seats = numberof_seats;
	}
	
	@Override
	public String toString() {
		return "Flight_info [flight_infoid=" + flight_infoid + ", flight_number=" + flight_number + ", flight_type="
				+ flight_type + ", numberof_seats=" + numberof_seats + "]";
	}
}
