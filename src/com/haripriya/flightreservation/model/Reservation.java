package com.haripriya.flightreservation.model;

public class Reservation extends AbstractModel{
    private Passenger passenger;
    private Flight flight;
    private long flightId;
    private int noOfbags;
    private boolean checkedIn;


    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getNoOfbags() {
        return noOfbags;
    }

    public void setNoOfbags(int noOfbags) {
        this.noOfbags = noOfbags;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "passenger=" + passenger +
                ", flight=" + flight +
                ", flightId=" + flightId +
                ", noOfbags=" + noOfbags +
                ", checkedIn=" + checkedIn +
                '}';
    }
}
