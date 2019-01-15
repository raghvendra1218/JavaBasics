package com.raghvendra;

public class Main {

    public static void main(String[] args) {
//        BankAccount bobsAccount = new BankAccount ();
//        BankAccount robsAccount = new BankAccount();//(12345, 0.0, "Rob Martin" , "rob.martin@gmail.com", 669204916);
//        System.out.println(robsAccount.getNumber());
//        System.out.println(robsAccount.getCustomerEmailAddress());
//        BankAccount gobsAccount = new BankAccount("Gob", "gob@fg.cv",123456);
//        System.out.println(gobsAccount.getNumber());
//        System.out.println(gobsAccount.getCustomerEmailAddress());
//        bobsAccount.withdrawFunds(100.0);
//        bobsAccount.depositFund(100.10);
////        bobsAccount.withdrawFunds(-101.0);
//        bobsAccount.depositFund(50);

        /*********************/

        VipCustomer raghav = new VipCustomer();
        System.out.println("Name: " +raghav.getName() + " Credit Limit: " + raghav.getCreditLimit() + " Email-i.D: " + raghav.getEmailAddress());
        VipCustomer martin = new VipCustomer("Martin", 350, "martin.gh@df.vb");
        System.out.println("Name: " +martin.getName() + "Credit Limit: " + martin.getCreditLimit() + "Email-i.D: " + martin.getEmailAddress());
        VipCustomer ram = new VipCustomer(850,"ram.fg@er.cv");
        System.out.println("Name: " +ram.getName() + "Credit Limit: " + ram.getCreditLimit() + "Email-i.D: " + ram.getEmailAddress());
    }
}
