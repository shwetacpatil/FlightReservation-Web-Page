package com.Flight_reservation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Flight_reservation.dto.ReservationRequest;
import com.Flight_reservation.entity.Flight;
import com.Flight_reservation.entity.Passenger;
import com.Flight_reservation.entity.Reservation;
import com.Flight_reservation.repository.FlightRepository;
import com.Flight_reservation.repository.PassengerRepository;
import com.Flight_reservation.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
        
        Passenger passenger=new Passenger();
        passenger.setFirstName(request.getFirstName());
        passenger.setLastName(request.getLastName());
        passenger.setMiddleName(request.getMiddleName());
        passenger.setEmail(request.getEmail());
        passenger.setPhone(request.getPhone());
        
        long flightId=request.getFlightId();
        Optional<Flight> findById=flightRepo.findById(flightId);
        Flight flight=findById.get();
        
        Reservation reservation=new Reservation();
        reservation.setFlight(flight);
        reservation.setPassenger(passenger);
        reservation.setCheckedIn(false);
        reservation.setNumberOfBags(0);
        
        reservationRepo.save(reservation);
        
		return null;
	}

}














