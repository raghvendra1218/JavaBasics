package com.raghvendra;

public class Main {

    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(890123345);
        myPhone.poweOn();
        myPhone.dial(890123345);
        myPhone.answer();
        myPhone.callPhone(890123345);

        myPhone = new MobilePhone(233445);
        myPhone.poweOn();
        myPhone.callPhone(233445);
        myPhone.answer();
    }
}
