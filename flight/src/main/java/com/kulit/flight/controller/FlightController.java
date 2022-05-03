package com.kulit.flight.controller;


import com.kulit.flight.model.Flight;
import com.kulit.flight.service.imp.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("flight")

public class FlightController {
   @Autowired
    FlightService flightService;

    @PostMapping
    public void saveone(@RequestBody Flight flight) {
        flightService.saveone(flight);
    }

   @GetMapping("/capacity")
    public int getCapacity(@RequestBody Flight flight) {
       return flightService.getCapacity(flight);
    }
    @GetMapping("/capacityById/{id}")
    public int getCapacityByID(@PathVariable UUID uuid) {
        return flightService.getCapacityByID(uuid);
    }

    @DeleteMapping
    public void DeleteFliight(Flight flight) {
        flightService.deleteFliight(flight);
    }

    @PutMapping("/{uuid}")
    public void removeFlightById(@PathVariable("uuid") UUID uuid ) {
        flightService.removeFlightById(uuid);
    }

    @PutMapping("/{id}")
    public void updateFlight(@PathVariable UUID uuid , @RequestBody Flight flight) {
        flightService.saveone(flight);
        //pr
    }

    @GetMapping
    public List<Flight> findall() {
//        return flightService.findall();
        return new ArrayList<Flight>();
    }

}
