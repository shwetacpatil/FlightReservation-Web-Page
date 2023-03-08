package com.Flight_reservation.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_reservation.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

	
	
}
