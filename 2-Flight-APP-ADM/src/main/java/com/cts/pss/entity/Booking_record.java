package com.cts.pss.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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

@Entity
public class Booking_record {
	
	@Id
	@GeneratedValue
	private int booking_id;
	private LocalDateTime booking_date;
	private String destination;
	private double fare;
	private LocalDate flight_date;
	private String flight_number;
	private LocalTime flight_time;
	private String origin;
	private String status;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "booking_details",joinColumns = {@JoinColumn(name="booking_id")}, inverseJoinColumns = {@JoinColumn(name = "passenger_id")})
	private List<Passenger> passenger= new ArrayList<>();
	
	public Booking_record() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking_record(int booking_id, LocalDateTime booking_date, String destination, double fare,
			LocalDate flight_date, String flight_number, LocalTime flight_time, String origin, String status) {
		super();
		this.booking_id = booking_id;
		this.booking_date = booking_date;
		this.destination = destination;
		this.fare = fare;
		this.flight_date = flight_date;
		this.flight_number = flight_number;
		this.flight_time = flight_time;
		this.origin = origin;
		this.status = status;
	}

	
	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public LocalDateTime getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(LocalDateTime booking_date) {
		this.booking_date = booking_date;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public LocalDate getFlight_date() {
		return flight_date;
	}

	public void setFlight_date(LocalDate flight_date) {
		this.flight_date = flight_date;
	}

	public String getFlight_number() {
		return flight_number;
	}

	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}

	public LocalTime getFlight_time() {
		return flight_time;
	}

	public void setFlight_time(LocalTime flight_time) {
		this.flight_time = flight_time;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}
	
	

}
