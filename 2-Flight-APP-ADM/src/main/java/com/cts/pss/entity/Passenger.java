package com.cts.pss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="passenger")
@SecondaryTable(name = "communications")
public class Passenger {
	
	

	@Id
	@GeneratedValue
	private int passenger_id;
	
	private String first_name;
	private String last_name;
	private String gender;
	//@Column(table = "communications")
	private long mobile_number;
	//@Column(table = "communications")
	private String email_address;
	
	@ManyToOne
	@JoinColumn(name = "booking_id")
	private Booking_record booking_record;

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Passenger(int passenger_id, String email_address, String first_name, String last_name, String gender,
			long mobile_number, Booking_record booking_record) {
		super();
		this.passenger_id = passenger_id;
		this.email_address = email_address;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.mobile_number = mobile_number;
		this.booking_record = booking_record;
	}



	public int getPassenger_id() {
		return passenger_id;
	}

	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}

	public Booking_record getBooking_record() {
		return booking_record;
	}

	public void setBooking_record(Booking_record booking_record) {
		this.booking_record = booking_record;
	}

	@Override
	public String toString() {
		return "Passenger [passenger_id=" + passenger_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", gender=" + gender + ", mobile_number=" + mobile_number + ", email_address=" + email_address
				+ ", booking_record=" + booking_record + "]";
	}

}
