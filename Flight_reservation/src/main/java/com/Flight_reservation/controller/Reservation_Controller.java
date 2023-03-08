package com.Flight_reservation.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Flight_reservation.dto.ReservationRequest;
import com.Flight_reservation.entity.Reservation;
import com.Flight_reservation.service.ReservationService;

@Controller
public class Reservation_Controller {
	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/showCompleteReservation")
	public String confirmReservation(ReservationRequest request, ModelMap modelMap) {
		
		Reservation reservation=reservationService.bookFlight(request);
		modelMap.addAttribute("reservation", reservation);
		return "confirmReservation";
	}

}
