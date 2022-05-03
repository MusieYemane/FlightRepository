package com.kulit.reservation.controller;

import com.kulit.reservation.domain.Reservation;
import com.kulit.reservation.repository.ReservationRepo;
import com.kulit.reservation.service.ReservationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/reservation"})
public class ReservationController {
    private ReservationService service;
    public ReservationController(ReservationService service){
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<Reservation>> getAllRes() {
        return ResponseEntity.ok(service.getAllRes());
    }

    @GetMapping("/{resId}")
    public ResponseEntity<Reservation> getResById(@PathVariable String resId) {
        return ResponseEntity.ok(service.getResById(resId));
    }

    @PostMapping
    public ResponseEntity<Reservation> saveReservation(Reservation reservation) {
        return ResponseEntity.ok(service.saveReservation(reservation));
    }

    @PutMapping
    public ResponseEntity<Reservation> updateReservation(String resId, Reservation newRes) {
        return ResponseEntity.ok(service.updateReservation(resId, newRes));
    }

    @DeleteMapping
    public void deleteReservation(String resId) {
        service.deleteReservation(resId);
    }
}
