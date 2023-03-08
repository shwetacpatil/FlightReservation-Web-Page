package com.Flight_reservation.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight_reservation.entity.Flight;
import com.Flight_reservation.repository.FlightRepository;

@Controller
public class Flight_Controller {
	
	@Autowired
	private FlightRepository flightRepo;
	
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("departure") @DateTimeFormat(pattern="MM-dd-yyyy") Date departure, ModelMap modelMap) {
		
		List<Flight> findFlights=flightRepo.findFlights(from,to,departure);
		modelMap.addAttribute("findFlights",findFlights);
		return "displayFlights";
	}
	
	
	@RequestMapping("/showCompleteReservation")
	public String showCompletRegervation(@RequestParam("flightId") long flightId, ModelMap modelMap) {
		
		Optional<Flight> findById=flightRepo.findById(flightId);
		Flight flight=findById.get();
		modelMap.addAttribute("flight", flight);
		return "showReservation";
	}

	
	
	
	
	
	
	
	
	
	
	

}


















