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
    }
}
