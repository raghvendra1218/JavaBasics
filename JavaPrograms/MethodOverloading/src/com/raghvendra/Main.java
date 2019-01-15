package com.raghvendra;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double cm = calcFeetAndinchesToCentimeters(1,11.99);
        System.out.println("Number of Centimeters = " + cm);
        cm = calcFeetAndinchesToCentimeters(10);
        System.out.println("Number of Centimeters = " + cm);
    }

    public static double calcFeetAndinchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feet or inches Parameters");
            return -1;
        } else {
            double Centimeters = 2.54 * inches + 30.48 * feet;
            return Centimeters;
        }
    }
    public static double calcFeetAndinchesToCentimeters(double inches){
        if (inches < 0) {
            System.out.println("Invalid inches Parameters");
            return -1;
        } else {
            double feet = (int) inches /12;
            double reminches = (int) inches % 12;
//            double cm = calcFeetAndinchesToCentimeters(feet,reminches);
//
            return calcFeetAndinchesToCentimeters(feet,reminches);
        }
    }

}
