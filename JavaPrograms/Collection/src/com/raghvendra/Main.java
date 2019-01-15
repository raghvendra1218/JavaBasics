package com.raghvendra;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("RajMandir", 8,10);
        theatre.getSeats();
        theatre.reserveSeat("B01");
        theatre.reserveSeat("B01");
        theatre.cancelSeat("B01");
        theatre.reserveSeat("B01");
        }
}
