package com.raghvendra;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this(700, "raghav.hj@df.cv");
        System.out.println("Default Constructor called");
    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        System.out.println("Constructor with Parameter is called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(int creditLimit, String emailAddress) {
        this("Dom",creditLimit, emailAddress);
        System.out.println("Constructor with two arguments is called.");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
