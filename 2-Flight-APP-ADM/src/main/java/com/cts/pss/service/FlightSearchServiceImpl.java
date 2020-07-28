package com.cts.pss.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pss.dao.FlightDao;
import com.cts.pss.entity.Flight;

@Service
public class FlightSearchServiceImpl {

	@Autowired
	FlightDao flightDao;
	
//	public Stream<Flight> searchFlightByDateAndOrigin(LocalDate localDate, String origin) {
//		
//		List<Flight> searchResult = flightDao.findByFlightDateAndOrigin(localDate, origin);
//		
//			Stream<Flight> searchReasult = searchResult.stream()
//				.filter(flight -> flight.getInventory().getCount() > 0);
//		
//		return searchReasult;
//	}
//	
//	public Stream<Flight> searchFlightByDateAndOriginAndDestination(LocalDate flightDate, String origin, String destination,
//			int numberOfPassengers) {
//
//		List<Flight> flights = flightDao.findByFlightDateAndOriginAndDestination(flightDate, origin, destination);
//
//		Stream<Flight> searchReasults = flights.stream()
//				.filter(flight -> flight.getInventory().getCount() >= numberOfPassengers);
//
//		return searchReasults;
//	}
//	
//	public Stream<Flight> searchFlightByDateAndOriginAndDestinationOrderByFlightFare(LocalDate flightDate, String origin, String destination,
//			int numberOfPassengers) {
//
//		List<Flight> flights = flightDao.findByDateAndOriginAndDestinationOrderByFare(flightDate, origin, destination);
//
//		Stream<Flight> searchReasults = flights.stream()
//				.filter(flight -> flight.getInventory().getCount() >= numberOfPassengers);
//
//		return searchReasults;
//	}
//	
//	public Stream<Flight> searchFlightNumberAndOriginAndDestination(String flightNumber, String origin, String destination, int numberOfPassengers) {
//		
//		List<Flight> flights = flightDao.findByFlightNumberAndOriginAndDestination(flightNumber, origin, destination);
//
//		Stream<Flight> searchReasults = flights.stream()
//				.filter(flight -> flight.getInventory().getCount() >= numberOfPassengers);
//
//		return searchReasults;
//	}
	
//	public Stream<Flight> searchFlightNumberAndDateAndTime(String flightNumber, LocalDate flightDate, LocalTime flightTime) {
//		
//		List<Flight> flights = flightDao.findByFlightNumberAndFlightDateAndFlightTime(flightNumber, flightDate, flightTime);
//
//		Stream<Flight> searchReasults = flights.stream()
//				.filter(flight -> flight.getInventory().getCount() >= 0);
//
//		return searchReasults;
//	}
	
	
	
	
}
