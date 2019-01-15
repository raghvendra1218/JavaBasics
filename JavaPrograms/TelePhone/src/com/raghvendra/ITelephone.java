package com.raghvendra;

public interface ITelephone {
    void poweOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
