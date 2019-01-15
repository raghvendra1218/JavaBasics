package com.raghvendra;

import static org.junit.Assert.*;

public class DeskPhoneTest {

    @org.junit.Test
    public void callPhone_answer() {
        ITelephone myPhone;
        myPhone = new DeskPhone(8898989);
        boolean isRinging = myPhone.callPhone(8898989);
        assertEquals(true,isRinging);
    }

    @org.junit.Test
    public void callPhone_noanswer() {
        ITelephone myPhone;
        myPhone = new DeskPhone(8898989);
        boolean isRinging = myPhone.callPhone(8898999);
        assertEquals(false,isRinging);
    }
}
