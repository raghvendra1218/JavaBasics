package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello world!");
        int result = 1 + 2 ;
        System.out.println("Addition = " + result);
//        result = result - 1;
        result -= 1;
        System.out.println("Subtracting 1 from result = " + result);
//        result = result * 10;
        result *= 10;
        System.out.println("Multiplying 10 to result = " + result);
        result = result/10;
        System.out.println("Dividing result by 10  = " + result);
        boolean isAlien = !false;
        if(isAlien == false) {
            System.out.println("It's not an Alien");
        } else {
            System.out.println("It's an Alien");
        }
        int topscore = 80;
        if(topscore < 100) {
            System.out.println("You got the high score");
        }

        int secondtopscore = 79;
        if((topscore > secondtopscore) && (topscore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if((topscore > 90) || (topscore <= 90)) {
            System.out.println("One of the conditions is true");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("This is true");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is true");
        }
        //Assignment:
        double a = 20d;
        double b = 80d;
        double c = (a + b) * 25;
        double rem = c % 40;
        if(rem <= 20) {
            System.out.println("Total was over the Limit");
        }

    }

}
