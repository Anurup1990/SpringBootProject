package com.cts.pss.service;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pss.dao.AirlineInfoDao;
import com.cts.pss.entity.Airline_info;
import com.cts.pss.entity.Flight;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirlineSearchServiceImpl {
	
	@Autowired
	AirlineInfoDao airlineInfoDao;
	
	public List<Airline_info> findAll() {
		
		List<Airline_info> airline_infos = new ArrayList<>();		
			airlineInfoDao.findAll()
			.forEach(airline_infos:: add);;
			
		return airline_infos;
	}
	
	
	public Airline_info searchFlightByLogoOfArirline(String airlineLogo) {
		
		Airline_info airline_info= airlineInfoDao.findByAirlineLogo(airlineLogo);
		
//		Stream<Flight> searchResult = flights.stream()
//				.filter(flight -> flight.getInventory().getCount() > 0);
		
		return airline_info;
		
	}

}
