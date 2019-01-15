package com.raghvendra;

import static junit.framework.Assert.*;

public class TheatreTest {

    @org.junit.Test
    public void reserveSeat_Success() {
        Theatre theatre = new Theatre("RajMandir", 5,6);
        boolean isReserved = theatre.reserveSeat("B01");
        assertEquals(true,isReserved);
    }

    @org.junit.Test
    public void reserveSeat_Failed() {
        Theatre theatre = new Theatre("RajMandir", 5,6);
        theatre.reserveSeat("B01");
        boolean isReserved = theatre.reserveSeat("B01");
        assertEquals(false,isReserved);
    }

    @org.junit.Test
    public void cancelSeat_Success() {
        Theatre theatre = new Theatre("RajMandir", 5,6);
        theatre.reserveSeat("B01");
        theatre.cancelSeat("B01");
        boolean isCanceled = theatre.cancelSeat("B01");
        assertEquals(false,isCanceled);
    }

    @org.junit.Test
    public void cancelSeat_Failed() {
        Theatre theatre = new Theatre("RajMandir", 5,6);
        theatre.reserveSeat("B01");
        theatre.cancelSeat("C01");
        boolean isCanceled = theatre.reserveSeat("B01");
        assertEquals(false,isCanceled);
    }

}
