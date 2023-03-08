package com.Flight_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_reservation.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

      User findByEmail(String emailId);

}
