package com.example.task.repository;

import com.example.task.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {

    List<FlightBooking> findByCustomerId(Integer customerId);

    List<FlightBooking> findByFlightId(Integer flightId);
}
