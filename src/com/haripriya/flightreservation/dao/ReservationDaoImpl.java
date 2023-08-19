package com.haripriya.flightreservation.dao;

import com.haripriya.flightreservation.model.Flight;
import com.haripriya.flightreservation.model.Reservation;

import java.util.HashMap;

public class ReservationDaoImpl implements ReservationDao{
    HashMap<Long, Flight> flights;
    HashMap<Long, Reservation> reservations;
    long reservationId;
    public ReservationDaoImpl(){
        reservations=new HashMap<>();
        flights = new HashMap<>();
        Flight flight1= new Flight();
        flight1.setId(1L);
        flight1.setFlightNumber("123");
        flight1.setOperatingAirlines("Indian");
        flight1.setDepartureCity("Nizamabad");
        flight1.setArrivalCity("Bangalore");
        flight1.setDateAndTimeOfDeparture("08/12/2023 12.00 PM IST");
        flights.put(flight1.getId(),flight1);

        Flight flight2= new Flight();
        flight2.setId(2L);
        flight2.setFlightNumber("234");
        flight2.setOperatingAirlines("Indian");
        flight2.setDepartureCity("Hyderabad");
        flight2.setArrivalCity("Bangalore");
        flight2.setDateAndTimeOfDeparture("08/13/2023 2.00 PM IST");
        flights.put(flight2.getId(),flight2);
    }

    @Override
    public Reservation bookFlight(Reservation reservation) {
        Flight flight = flights.get(reservation.getFlightId());
        reservation.setFlight(flight);
        reservations.put(++reservationId, reservation);
        return reservation;
    }

    @Override
    public Reservation checkIn(int noOfBags, long reservationId) {
        Reservation reservation1 = reservations.get(reservationId);
        reservation1.setNoOfbags(noOfBags);
        reservation1.setCheckedIn(true);
        return reservation1;
    }

}
