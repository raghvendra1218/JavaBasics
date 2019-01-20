package com.raghvendra;

public class Main {

    public static void main(String[] args) {
        String privateVar = "this is from main()";
	    ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("Vlaue of privateVar: "+ scopeCheck.getPrivateVar());
        System.out.println(privateVar);
        scopeCheck.timesTwo();
        System.out.println("************************");
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        innerClass.timesTwo();
        //To check the visibility of the Containing class accessing the private member variable using the useInner method
        scopeCheck.useInner();
//        System.out.println("varThree is not accessible here "+ innerClass.varThree); //becoz the member variable is declared as private, but if declared as public it will be accessible here

    }
}
