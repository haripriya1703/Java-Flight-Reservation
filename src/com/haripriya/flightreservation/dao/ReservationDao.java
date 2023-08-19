package com.haripriya.flightreservation.dao;


import com.haripriya.flightreservation.model.Reservation;

public interface ReservationDao {
    Reservation bookFlight(Reservation reservation);

    Reservation checkIn(int noOfBags, long reservationId);
}
