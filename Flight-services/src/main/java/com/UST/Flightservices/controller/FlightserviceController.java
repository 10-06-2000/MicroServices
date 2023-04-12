package com.UST.Flightservices.controller;

import com.UST.Flightservices.dto.BookingRequest;
import com.UST.Flightservices.dto.FlightBookingAcknowledgement;
import com.UST.Flightservices.exception.InsufficientAmountException;
import com.UST.Flightservices.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FlightserviceController {
    @Autowired
    public FlightBookingService flightbookingservice;
    @PostMapping("/booking")
    public FlightBookingAcknowledgement bookingAcknowledgement(@RequestBody BookingRequest request) throws InsufficientAmountException {
        return flightbookingservice.bookingFlightTicket(request);
    }
}
