package com.cts.pss.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.pss.entity.Airline_info;
import com.cts.pss.entity.Flight;
import com.cts.pss.service.AirlineSearchServiceImpl;

@Controller
public class FlightController {

	@Autowired
	AirlineSearchServiceImpl airlineSearchServiceImpl;
	
	@RequestMapping("/book1")
	public String book1(@ModelAttribute Flight flight) {
//		System.out.println(flight);
//		System.out.println("<<<<< >>>>");
//		System.out.println(flight.getFlightNumber());
		
		return "flights";
	}
	
}
