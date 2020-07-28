package com.cts.pss.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entity.Flight;

public interface FlightDao extends JpaRepository<Flight, Integer>{
	
//	//Query to search using date and origin
//	List<Flight> findByFlightDateAndOrigin(LocalDate localDate, String origin);
//	
//	//Query to search using date and origin and destination
//	List<Flight> findByFlightDateAndOriginAndDestination(LocalDate flightDate, String origin, String destination);
//	
//	//Query to search using date and origin and destination
//		List<Flight> findByDateAndOriginAndDestinationOrderByFare(LocalDate flightDate, String origin, String destination);
//
//	//Query to search using flight number and origin and destination
//	List<Flight> findByFlightNumberAndOriginAndDestination(String flightNumber, String origin, String destination);
// 
//	//Query to search using flight number and date and time
//	List<Flight> findByFlightNumberAndFlightDateAndFlightTime(String flightNumber, LocalDate localDate, LocalTime localTime);
}
