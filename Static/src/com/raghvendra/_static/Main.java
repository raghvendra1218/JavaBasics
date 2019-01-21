package com.raghvendra._static;

// Main method is made as static because at the time of start before any class or object could be instantiated program needs to run, Hence main method as static,
// so that it can be called just by referencing to it's class sthng like : X.main()
// It is not necessary for class to be named as "Main", it can be named to any other name(say "X"), but the class which has been asked to run as begining class via cmd --> "package.com.raghvendra._static.Main/(or)X
// should have main method.
//Static - instances/methods are variables at class level and they do not belong to any object they are shared between all the instances/objects of that class
//any variable can be made as static by prefixing the variable with static keyword after access modifiers.
//FINAL - static variables can be changed unlike variables prefixed with final keywords, they can only be changed or initialised while declaring or inside a constructor.
//STATIC FINAL - To declare a constant in java use static final both keywords and declare it at class level in all caps.
// makes sense as constant is once initialised and is available for entire class to access it whenever required.
// IMPORTANT -If you don't want class to create any instance, without using the abstract keyword is to make the constructor private. ex - Math class
// Any class which has been marked as Final, that class cannot be sub-classed. example : Math class in Java.
// Any method which has been marked as Final, that method cannot be overridden. while class can be subclassed.
// order of execution: Main method --> All static blocks (irrespective where in class they are declared) -- > constructor --> nonstatic methods.

public class Main {

    private int number = 3;
    public static void main(String[] args) {
        Main main = new Main();
        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName()+" is the instance with instance number "+ firstInstance.getNumInstances());
        //After declaring the getNumInstances as static method:
        System.out.println(firstInstance.getName()+" is the instance with instance number "+ StaticTest.getNumInstances());
        StaticTest secondInstance = new StaticTest("2nd Instance");
        //After declaring the getNumInstances as static method:
        System.out.println(secondInstance.getName()+" is the instance with instance number "+ StaticTest.getNumInstances());
//        System.out.println(secondInstance.getName()+" is the instance with instance number "+ secondInstance.getNumInstances());
        StaticTest thirdInstance = new StaticTest("3rd Instance");
        //After declaring the getNumInstances as static method:
        System.out.println(thirdInstance.getName()+" is the instance with instance number "+ StaticTest.getNumInstances());
//        System.out.println(thirdInstance.getName()+" is the instance with instance number "+ thirdInstance.getNumInstances());
        StaticTest.numInstances = 10;
        System.out.println("Instance Number: "+ StaticTest.getNumInstances()); // static variables can be changed unlike variables prefixed with final keyword, they can only be chnaged or initialised whiel declaring or inside a constructor.
//        thirdInstance.numInstancesFinal = 12; // error is thrown "cannot assign a value to a final variable;
        int result = main.multiply(3);
        System.out.println(" The result: "+ result);
    }

    public int multiply(int w){
//        System.out.println("The result is: " + w*number);
        return w*number;
    }
}
