package com.raghvendra;

import java.util.* ;

public class Theatre {
    private String theatreName;
    private Collection<Seat> seats =  new ArrayList<Seat>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' +(numRows -1);
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <=seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for(Seat seat: seats) {
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if(requestedSeat == null) {
            System.out.println("There is no such seat Number");
            return false;
        }
        return requestedSeat.reserve();
    }

    public boolean cancelSeat(String seatNumber) {
        Seat cancelSeat = null;
        for(Seat seat : seats) {
            if(seat.getSeatNumber().equals(seatNumber)) {
                cancelSeat = seat;
                break;
            }
        }
        if(cancelSeat == null) {
            System.out.println("There is no such Seat. Please try again.");
            return false;
        }
        return cancelSeat.cancel();
    }

    public void getSeats() {
        for(Seat seat: seats) {
            System.out.println(seat.getSeatNumber());
        }
    }
}
