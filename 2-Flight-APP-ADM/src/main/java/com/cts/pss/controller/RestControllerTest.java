package com.cts.pss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pss.entity.Airline_info;
import com.cts.pss.service.AirlineSearchServiceImpl;

@RestController
public class RestControllerTest {

	@Autowired
	AirlineSearchServiceImpl airlineSearchServiceImpl;
	
//	@RequestMapping("/find")
//	public List<Airline_info> findAll() {
//
//		System.out.println("--list-----------" + airlineSearchServiceImpl.findAll());
//
//		List<Airline_info> airline_infos = airlineSearchServiceImpl.findAll().forEach(Airline_info -> Airline_info.get);
//		
//		return airline_infos;
//	}
}
