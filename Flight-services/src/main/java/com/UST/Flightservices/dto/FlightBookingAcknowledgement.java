package com.UST.Flightservices.dto;

import com.UST.Flightservices.entity.Passengerinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FlightBookingAcknowledgement {

    private String status;
    private String amount;
    private String pnrno;
    private Passengerinfo passengerinfo;

    public FlightBookingAcknowledgement(String success, double fare, String pnrno, Passengerinfo passangerinfo) {
    }
}
