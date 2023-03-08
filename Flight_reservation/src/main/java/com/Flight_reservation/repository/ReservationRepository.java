package com.Flight_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_reservation.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
