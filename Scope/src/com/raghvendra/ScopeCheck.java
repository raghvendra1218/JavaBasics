package com.raghvendra;

public class ScopeCheck {
    public int publicVar = 0;
    private  int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = "+publicVar + ":privateVar = "+ privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        int privateVar = 2;
        for(int i =0 ; i <10; i++){
//            System.out.println(privateVar +" times "+ i + " is "+ i * privateVar); //scope is local if privateVar found, otherwise will search at class level
            System.out.println(this.privateVar +" times "+ i + " is "+ i * this.privateVar); // scope is from global variable, despite having local privateVar, becoz of this keyword
        }
    }

    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is: "+ privateVar);
        }

        public void timesTwo(){
//            int privateVar = 2;
            for(int i =0 ; i <10; i++){
//                System.out.println(privateVar +" times "+ i + " is "+ i * privateVar); //scope is local to the function, if not found will search at class level
//                System.out.println(this.privateVar +" times "+ i + " is "+ i * this.privateVar); //scope is local to the global variable of class
                System.out.println(ScopeCheck.this.privateVar +" times "+ i + " is "+ i * ScopeCheck.this.privateVar); //Scope is from global variable becoz of Scopecheck prefixed to this keyword
            }
        }
    }
}
