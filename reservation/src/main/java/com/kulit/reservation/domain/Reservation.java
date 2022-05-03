package com.kulit.reservation.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Reservation {
    private String resId;
    private LocalDate resDate;
    private String resStatus;
    private String flightId;
    private String customerId;


}
