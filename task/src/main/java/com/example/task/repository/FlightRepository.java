package com.example.task.repository;

import com.example.task.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

    Flight findByFlightNumber(String flightNumber);
}
