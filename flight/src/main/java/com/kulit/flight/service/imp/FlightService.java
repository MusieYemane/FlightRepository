package com.kulit.flight.service.imp;


import com.kulit.flight.model.Flight;
import com.kulit.flight.repository.FlightRepository;
import com.kulit.flight.service.FlightInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class FlightService implements FlightInt {
      @Autowired
      FlightRepository flightRepository;


    @Override
    public void saveone(Flight flight) {
        flightRepository.save(flight);
    }

    @Override
    public int getCapacity(Flight flight) {
        Optional<Flight> result = flightRepository.findById(flight.getId());
        return result.get().getCapacity();
    }

    @Override
    public int getCapacityByID(UUID id) {
       Optional<Flight> resul =flightRepository.findById(id);
        return resul.get().getCapacity();

    }

    @Override
    public void deleteFliight(Flight flight) {
        flightRepository.delete(flight);
    }

    @Override
    public void removeFlightById(UUID uuid) {
     flightRepository.deleteById(uuid);
    }

    @Override
    public void updateFlight(UUID uuid , Flight flight) {
        flight.setId(uuid);
      flightRepository.save(flight);
      //pr
    }

    @Override
    public List<Flight> findall() {
        return flightRepository.findAll();
    }
}
