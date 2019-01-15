package com.raghvendra;

public class BankAccount {
    private int Number;
    private double Balance;
    private String customerName;
    private String customerEmailAddress;
    private long customerPhoneNumber;


    public BankAccount() {
        this(5432, 250.21, "Default Name","Default Address", 999999);
        System.out.println("This is an empty BankAccount Constructor.");
    }

    public BankAccount(int number, double balance, String customerName, String customerEmailAddress, long customerPhoneNumber) {
        System.out.println("BankAccount Constructor with  Parameters is called.");
        this.Number = number;
        this.Balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmailAddress, long customerPhoneNumber) {
        this(223452, 321.12, customerName, customerEmailAddress, customerPhoneNumber);
    }

    public int getNumber() {
        return Number;
    }

    public double getBalance() {
        return Balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public long getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFund (double depositFunds) {
        if(depositFunds > 0) {
            this.Balance = depositFunds + Balance;
            System.out.println("Deposit of " + depositFunds + " made. New Balance = " + this.Balance);
        } else {
            System.out.println("Enter the valid funds to be deposited.");
        }

    }

    public void withdrawFunds(double withdrawFunds) {
        if(withdrawFunds > 0 && this.Balance > withdrawFunds) {
            this.Balance = Balance - withdrawFunds;
            System.out.println("Withdrawl of " + withdrawFunds + " processed. Remaining Balance = " + this.Balance);
        } else {
            System.out.println("Insufficient Funds, Only " + this.Balance + " available. Withdrawal not Processed.");
        }
    }
}
