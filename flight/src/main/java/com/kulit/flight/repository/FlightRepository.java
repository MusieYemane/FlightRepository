package com.kulit.flight.repository;

import com.kulit.flight.model.Flight;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
@Repository
public interface FlightRepository extends CassandraRepository<Flight , UUID> {

    @AllowFiltering
    List<Flight> findBystartTime(LocalDate x);

}
