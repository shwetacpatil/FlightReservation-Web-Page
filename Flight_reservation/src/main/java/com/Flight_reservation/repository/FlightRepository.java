package com.Flight_reservation.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Flight_reservation.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	
	@Query("from Flight where departure=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:departure")
	List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to,@Param("dateOfDeparture") Date departure);

}
