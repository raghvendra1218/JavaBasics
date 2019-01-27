package com.raghvendra;

import java.util.* ;

// As we move down the hierarchy, interface becomes more specialised.
// so we can only replace classes with all the classes which implement one of the core collection interfaces at the same level.


public class Theatre {
    private String theatreName;
    public List<Seat> seats = new ArrayList<Seat>();
//    private Collection<Seat> seats =  new ArrayList<Seat>(); //will work
//    private Collection<Seat> seats =  new LinkedList<Seat>(); //will work
//    private Collection<Seat> seats =  new LinkedHashSet<Seat>(); //will work
//    private Collection<Seat> seats =  new HashSet<Seat>(); //will work
//    private Collection<Seat> seats =  new LinkedHashSet<Seat>(); //will work
//  private Collection<Seat> seats =  new TreeSet<Seat>(); // will not work, because it's two level down the hierarchy (it extends sortedsets


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
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat with seat number"+ seatNumber);
            return false;
        }

//        Seat requestedSeat = null;
//        for(Seat seat: seats) {
//            if(seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if(requestedSeat == null) {
//            System.out.println("There is no such seat Number");
//            return false;
//        }
//        return requestedSeat.reserve();
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
