package com.raghvendra;

public class Seat implements Comparable<Seat> {
    private final String seatNumber;
    private boolean reserved = false;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    //Override the compareTo which comes with Comparable interface


    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }

    public boolean reserve() {
        if(!this.reserved) {
            this.reserved = true;
            System.out.println("Seat "+ seatNumber + " reserved.");
            return true;
        } else {
            System.out.println("Seat is already reserved.");
            return false;
        }
    }

    public boolean cancel() {
        if(this.reserved) {
            this.reserved = false;
            System.out.println("Seat "+ seatNumber +" has been cancelled.");
            return true;
        } else {
            System.out.println("Seat is not reserved. Hence cannot be cancelled.");
            return false;
        }
    }

    public String getSeatNumber() {
        return seatNumber;
    }
}
