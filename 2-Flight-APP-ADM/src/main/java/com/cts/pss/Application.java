package com.cts.pss;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.pss.dao.BookingRecordDao;
import com.cts.pss.dao.FlightDao;
import com.cts.pss.dao.AirlineInfoDao;
import com.cts.pss.dao.PassengerDao;
import com.cts.pss.dao.UserDao;
import com.cts.pss.entity.Airline_info;
import com.cts.pss.entity.Booking_record;
import com.cts.pss.entity.Fare;
import com.cts.pss.entity.Flight;
import com.cts.pss.entity.Flight_info;
import com.cts.pss.entity.Inventory;
import com.cts.pss.entity.Passenger;
import com.cts.pss.entity.User;
import com.cts.pss.service.AirlineSearchServiceImpl;
import com.cts.pss.service.FlightSearchServiceImpl;
import com.cts.pss.service.UserServiceImpl;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
//		DataInsert dataInsert = ac.getBean(DataInsert.class);
//		dataInsert.getData();
		
//		UserServiceImpl userServiceImpl = ac.getBean(UserServiceImpl.class);
//		UserDao dao = ac.getBean(UserDao.class);
//		User user1 = new User("abc","pass1",LocalDateTime.of(2020, 8, 21, 10,11));
//		User user2 = new User("xyz","pass1",LocalDateTime.of(2020, 8, 22, 14,11));
//		dao.saveAll(Arrays.asList(user1,user2));
		
		System.out.println("------------------------------------------------------");
		
		
		
		
		
		
/*		FlightDao dao = ac.getBean(FlightDao.class);
		AirlineInfoDao airlineInfoDao = ac.getBean(AirlineInfoDao.class);
		PassengerDao passengerDao = ac.getBean(PassengerDao.class);
		BookingRecordDao bookingRecordDao = ac.getBean(BookingRecordDao.class);
		
	//	FlightSearchServiceImpl flightSearchServiceImpl = ac.getBean(FlightSearchServiceImpl.class);
		AirlineSearchServiceImpl airlineSearchServiceImpl = ac.getBean(AirlineSearchServiceImpl.class);
		
		
		Airline_info airline_info =  airlineSearchServiceImpl.searchFlightByLogoOfArirline("airindia.png");
		
		//airlineSearchServiceImpl.findAll();
		
//		System.out.println("--list-----------" + airlineSearchServiceImpl.findAll());
//
		
			System.out.println(airline_info.getAirlineId());
			System.out.println(airline_info.getAirlineLogo());
			System.out.println(airline_info.getNameOfAirline());
			System.out.println("------------------------------------------------------");
			
			for ( Flight_info flight_info  : airline_info.getFlightInfo()) {
				System.out.println(flight_info);
				
			}


			
//		Flight f1=new Flight("AI-100", "Hyderabad", "Chennai", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(2, 45), 
//				new Fare("INT", 4500), new Inventory(150), 
//				new Flight_info("AI-840", "Airbus", 150, new Airline_info(1, "airindia.png", "Air India")));
//		Flight f2=new Flight("AI-150", "Delhi", "Chennai", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(2, 45), 
//				new Fare("INT", 1200), new Inventory(150), 
//				new Flight_info("AI-850", "Airbus", 150, new Airline_info(6, "Indigo.png", "Indigo")));
//		Flight f3=new Flight("6E-250", "Delhi", "Chennai", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(17, 15), 
//				new Fare("INT", 4500), new Inventory(150), 
//				new Flight_info("AI-860", "Airbus", 150, new Airline_info(6, "Indigo.png", "Indigo")));
//		Flight f4=new Flight("6E-400", "Mumbai", "Delhi", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(2, 45), 
//				new Fare("INT", 9500), new Inventory(150), 
//				new Flight_info("AI-870", "Airbus", 150, new Airline_info(11, "air-asia.png", "Air Asia")));
//		Flight f5=new Flight("AI-200", "Delhi", "Pune", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(12, 45), 
//				new Fare("INT", 4200), new Inventory(150), 
//				new Flight_info("6E-6684", "Airbus", 150, new Airline_info(16, "spicejet.png", "Spicejet")));
//		Flight f6=new Flight("AI-500", "Delhi", "Kolkata", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(8, 45), 
//				new Fare("INT", 3500), new Inventory(150), 
//				new Flight_info("6E-6685", "Airbus", 150, new Airline_info(21, "vistara.png", "Vistara")));
//		Flight f7=new Flight("6E-280", "Chennai", "Mumbai", "3 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(17, 15), 
//				new Fare("INT", 4500), new Inventory(150), 
//				new Flight_info("AI-860", "Airbus", 150, new Airline_info(26, "truejet.png", "Trujet")));
//		Flight f8=new Flight("6E-410", "Mumbai", "Kolkata", "1 Hours 15 Mins", LocalDate.of(2020, 9, 20), LocalTime.of(2, 45), 
//				new Fare("INT", 9500), new Inventory(160), 
//				new Flight_info("AI-870", "Airbus", 160, new Airline_info(31, "goair.png", "GoAir")));
//		Flight f9=new Flight("AI-600", "Delhi", "Pune", "2 Hours 30 Mins", LocalDate.of(2020, 8, 11), LocalTime.of(12, 45), 
//				new Fare("INT", 2200), new Inventory(170), 
//				new Flight_info("6E-6684", "Airbus", 170, new Airline_info(21, "vistara.png", "Vistara")));
//		Flight f10=new Flight("AI-550", "Delhi", "Kolkata", "2 Hours 15 Mins", LocalDate.of(2020, 8, 27), LocalTime.of(8, 45), 
//				new Fare("INT", 3000), new Inventory(150), 
//				new Flight_info("6E-6685", "Airbus", 150, new Airline_info(11, "air-asia.png", "Air Asia")));
		
		
		
		
		
		Flight_info fi1 = new Flight_info("6E-6685", "Airbus", 150);
		Flight_info fi2 = new Flight_info("AI-840", "Airbus", 150);
//
//		Airline_info aInfo1 = new Airline_info("airindia.png", "Air India");
//		aInfo1.getFlightInfo().add(fi1);
//		aInfo1.getFlightInfo().add(fi2);
//		
//		airlineInfoDao.save(aInfo1);
		
//		Flight f1=new Flight("AI-100", "Hyderabad", "Chennai", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(2, 45), new Fare("INT", 4500), new Inventory(150), fi1);
//		Flight f2=new Flight("AI-150", "Delhi", "Chennai", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(2, 45), new Fare("INT", 1200), new Inventory(150), fi2);

		
//		Flight f3=new Flight("6E-250", "Delhi", "Chennai", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(17, 15), new Fare("INT", 4500), new Inventory(150), new Flight_info("AI-860", "Airbus", 150));
//		Flight f4=new Flight("6E-400", "Mumbai", "Delhi", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(2, 45), new Fare("INT", 9500), new Inventory(150), new Flight_info("AI-870", "Airbus", 150));
//		Flight f5=new Flight("AI-200", "Delhi", "Pune", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(12, 45), new Fare("INT", 4200), new Inventory(150), new Flight_info("6E-6684", "Airbus", 150));
//		Flight f6=new Flight("AI-500", "Delhi", "Kolkata", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(8, 45), new Fare("INT", 3500), new Inventory(150), new Flight_info("6E-6685", "Airbus", 150));
//		Flight f7=new Flight("6E-280", "Chennai", "Mumbai", "3 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(17, 15), new Fare("INT", 4500), new Inventory(150), new Flight_info("AI-860", "Airbus", 150));
//		Flight f8=new Flight("6E-410", "Mumbai", "Kolkata", "1 Hours 15 Mins", LocalDate.of(2020, 9, 20), LocalTime.of(2, 45), new Fare("INT", 9500), new Inventory(160), new Flight_info("AI-870", "Airbus", 160));
//		Flight f9=new Flight("AI-600", "Delhi", "Pune", "2 Hours 30 Mins", LocalDate.of(2020, 8, 11), LocalTime.of(12, 45), new Fare("INT", 2200), new Inventory(170), new Flight_info("6E-6684", "Airbus", 170));
//		Flight f10=new Flight("AI-550", "Delhi", "Kolkata", "2 Hours 15 Mins", LocalDate.of(2020, 8, 27), LocalTime.of(8, 45), new Fare("INT", 3000), new Inventory(150), new Flight_info("6E-6685", "Airbus", 150));
	
//		dao.saveAll(Arrays.asList(f1,f2));
		
		System.out.println("---------------saved-----------------------");
		
		
		
		
		
		
		
//		Airline_info aInfo2 = new Airline_info("Indigo.png", "Indigo");
//		Airline_info aInfo3 = new Airline_info("air-asia.png", "Air Asia");
//		Airline_info aInfo4 = new Airline_info("spicejet.png", "Spicejet");
//		Airline_info aInfo5 = new Airline_info(21, "vistara.png", "Vistara");
//		Airline_info aInfo6 = new Airline_info(26, "truejet.png", "Trujet");
//		Airline_info aInfo7 = new Airline_info(31, "goair.png", "GoAir");
		
//		airlineInfoDao.saveAll(Arrays.asList(aInfo1,aInfo2,aInfo3,aInfo4,aInfo5,aInfo6,aInfo7));
		
//		Booking_record b1 = new Booking_record(93, LocalDateTime.of(2020,07,14, 10,44), "HYDERABAD", 3500, LocalDate.of(2020, 8, 21), "AI-850", LocalTime.of(01, 15), "DELHI", "Confirmed");
//		bookingRecordDao.saveAll(Arrays.asList(b1));
		
//		Passenger p1 = new Passenger(94,"praveen@abc.com", "Praveen", "Reddy", "Male", 1212121212,
//				new Booking_record(93, LocalDateTime.of(2020,07,14, 10,44), "HYDERABAD", 3500, LocalDate.of(2020, 8, 21), "AI-850", LocalTime.of(01, 15), "DELHI", "Confirmed"));	
//		Passenger p2 = new Passenger(95,"anurup@abc.com", "Anurup", "Sarkar", "Male", 1212131415,
//				new Booking_record(94, LocalDateTime.of(2020,07,14, 10,44), "KOLKATA", 4500, LocalDate.of(2020, 8, 21), "AI-860", LocalTime.of(01, 15), "DELHI", "Confirmed"));

//		passengerDao.saveAll(Arrays.asList(p1));
		
		//Search Flight-----------
		
	//	Stream<Flight> flights = flightSearchServiceImpl.searchFlightByDateAndOrigin(LocalDate.of(2020, 8, 21), "DELHI");
		
	//	Stream<Flight> flights = flightSearchServiceImpl.searchFlightByDateAndOriginAndDestination(LocalDate.of(2020, 8, 21), "DELHI", "Kolkata", 2);
		
	//	Stream<Flight> flights = flightSearchServiceImpl.searchFlightByDateAndOriginAndDestinationOrderByFlightFare(LocalDate.of(2020, 8, 21), "DELHI", "Kolkata", 2);
		
		
	//	Stream<Flight> flights = flightSearchServiceImpl.searchFlightNumberAndOriginAndDestination("AI-600", "DELHI", "Pune",0);
		
	//	Stream<Flight> flights = flightSearchServiceImpl.searchFlightNumberAndDateAndTime("AI-100", LocalDate.of(2020, 8, 21), LocalTime.of(2, 45));
		
		
		  
		  
		  
		  
//				Stream<Flight> flights = 	airlineSearchServiceImpl.searchFlightByNameOfAirline("Indigo.png");
//		
//		flights.forEach(flight -> {
//			System.out.println(flight.getId());
//			System.out.println(flight.getFlightNumber());
//			System.out.println(flight.getOrigin());
//			System.out.println(flight.getDestination());
//			System.out.println(flight.getFlightDate());
//			System.out.println(flight.getFlightTime());
//			System.out.println("Price: " + flight.getFare().getFare());
//			System.out.println("Available: " + flight.getInventory().getCount());
//			System.out.println("------------------------------------------------------");
//
//		});
		*/
	}

}
