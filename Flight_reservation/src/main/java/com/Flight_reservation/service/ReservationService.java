package com.Flight_reservation.service;

import com.Flight_reservation.dto.ReservationRequest;
import com.Flight_reservation.entity.Reservation;


public interface ReservationService {
	Reservation bookFlight(ReservationRequest request);

}
