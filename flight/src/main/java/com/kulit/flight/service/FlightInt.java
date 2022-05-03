package com.kulit.flight.service;

import com.kulit.flight.model.Flight;

import java.util.List;
import java.util.UUID;

public interface FlightInt {
    void saveone (Flight flight);
    int getCapacity (Flight flight);
    int getCapacityByID (UUID flight);
    void deleteFliight (Flight flight);
    void removeFlightById (UUID uuid);
    void updateFlight (UUID uuid , Flight flight);
    List<Flight> findall ();



}
