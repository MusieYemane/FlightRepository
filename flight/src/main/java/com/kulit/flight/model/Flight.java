package com.kulit.flight.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping .PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table
public class Flight {
    int capacity;
    double distance;
    LocalDate endDateTime;
    String flightCode;
    @PrimaryKey
    UUID id;
    double price;
    LocalDateTime startDateTime;
    String destination;
    String source;

}
