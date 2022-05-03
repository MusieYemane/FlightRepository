package com.kulit.reservation.repository;

import com.kulit.reservation.domain.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepo extends MongoRepository<Reservation, String> {

}
