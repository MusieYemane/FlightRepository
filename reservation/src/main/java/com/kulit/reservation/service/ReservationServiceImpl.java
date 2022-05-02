package com.kulit.reservation.service;

import com.kulit.reservation.domain.Reservation;
import com.kulit.reservation.repository.ReservationRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService{

    private ReservationRepo repo;
    public ReservationServiceImpl(ReservationRepo repo){
        this.repo=repo;
    }
    @Override
    public List<Reservation> getAllRes() {
        return repo.findAll();
    }

    @Override
    public Reservation getResById(String resId) {
        return repo.findById(resId).orElseThrow(()-> new RuntimeException("Product not found"));
    }

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return repo.save(reservation);
    }

    @Override
    public Reservation updateReservation(String resId, Reservation newRes) {
        newRes.setResId(resId);
        return repo.save(newRes);
    }

    @Override
    public void deleteReservation(String resId) {
        repo.deleteById(resId);
    }
}
