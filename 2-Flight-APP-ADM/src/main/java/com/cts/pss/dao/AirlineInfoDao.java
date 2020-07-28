package com.cts.pss.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entity.Airline_info;
import com.cts.pss.entity.Flight;

public interface AirlineInfoDao extends JpaRepository<Airline_info, Integer>{


	Airline_info findByAirlineLogo(String airlineLogo);
}
