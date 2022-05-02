package com.kulit.reservation.service;

import com.kulit.reservation.domain.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> getAllRes();
    Reservation getResById(String id);
    Reservation saveReservation(Reservation reservation);
    Reservation updateReservation(String resId, Reservation newRes);
    void deleteReservation(String resId);

}
