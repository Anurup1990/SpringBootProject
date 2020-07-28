package com.cts.pss.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@Table(schema = "test16")
public class Fare {

	@Id
	@GeneratedValue
	private int fareId;
	private String currency;
	private int fare;
	
	
	public Fare() {
		// TODO Auto-generated constructor stub
	}

	public Fare(String currency, int fare) {
		super();
		this.currency = currency;
		this.fare = fare;
	}

	public int getFareId() {
		return fareId;
	}

	public void setFareId(int fareId) {
		this.fareId = fareId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}



}
