package com.cts.pss.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;



@Entity
public class User {

	@Id
	private String userName;
	private String password;
	private LocalDateTime loginTime;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="passengerId")
	private Passenger passenger;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(LocalDateTime loginTime) {
		this.loginTime = loginTime;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", loginTime=" + loginTime + ", passenger="
				+ passenger + "]";
	}
	
	
	
	

}
