package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int switchValue = 3;
//        switch (switchValue) {
//            case 1:
//                System.out.println("value was 1");
//                break;
//
//            case 2 :
//                System.out.println("value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("value was 3 or 4 or 5");
//                System.out.println("Actually value was "+ switchValue);
//                break;
//
//            default:
//                System.out.println("Value was not in desired range");
//                break;
//        }

        char switchValue = 'E';
        switch (switchValue) {
            case 'A':
                System.out.println("value is A");
                break;
            case 'B':
                System.out.println("value is B");
                break;
            case 'C':
                System.out.println("value is C");
                break;
            case 'D': case 'E':
                System.out.println("value is " + switchValue);
                break;
//            case 'E':
//                System.out.println("value is E");
//                break;
            default:
                System.out.println("value not found");
                break;
        }

        String month = "JanuAry";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("not sure");
                break;
        }
    }
}
