package com.raghvendra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("RajMandir", 8,10);
//        theatre.getSeats();
//        theatre.reserveSeat("B01");
//        theatre.reserveSeat("B01");
//        theatre.cancelSeat("B01");
//        theatre.reserveSeat("B01");
// Creating the copy of the ArrayList from the already existing list of seats that's why we have made Array List public in Theatre class
            List<Seat> seatCopy = new ArrayList<Seat>(theatre.seats); //This is shallow copy, reference is pointing to same as theatre.seats object
            System.out.println("Printing Seat Copy: ");
            printList(seatCopy);
            System.out.println("Printing theatre.seats: ");
            printList(theatre.seats);
            // Proof that it is shallow copy pointing to same object.
        //        seatCopy.get(1).reserve();
        //        theatre.seats.get(1).reserve();

            //Reverse the array list from collections in-built reverse method
            Collections.reverse(seatCopy);
            System.out.println("Printing reverse seatCopy: ");
            printList(seatCopy);

            //Shuffling the List using built in shuffle method
            Collections.shuffle(seatCopy);
            System.out.println("Printing the shuffled seatCopy: ");
            printList(seatCopy);

            //Get the min elemnet and max element in the List using built-in collections min and max method
            System.out.println("Minimum element in the seatCopy List: "+ Collections.min(seatCopy).getSeatNumber()); //does not requires list to be sorted.
            System.out.println("Maximum element in the seatCopy List: "+ Collections.max(seatCopy).getSeatNumber()); //does not requires list to be sorted.
            //Swap the elements using built -in swap method in collection
            System.out.println("Current order of first and last seats in theatre.seats :");
            System.out.println("First Seat: "+theatre.seats.get(0).getSeatNumber()+" Last seat: "+ theatre.seats.get(theatre.seats.size()-1).getSeatNumber());
            System.out.println("Swapping the first element of theatre.seats with the last");
            Collections.swap(theatre.seats, 0, theatre.seats.size()-1);
            System.out.println("First Seat after swap: "+theatre.seats.get(0).getSeatNumber()+" Last seat after swap: "+ theatre.seats.get(theatre.seats.size()-1).getSeatNumber());

        }

        public static void printList(List<Seat> list){
            for(Seat seat : list){
                System.out.print(" "+ seat.getSeatNumber());
            }
            System.out.println();
            System.out.println("=========================================================");
        }
}
