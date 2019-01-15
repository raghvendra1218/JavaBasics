package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // int has a width of 32
//        int myMinValue = -2147483648;   //->(this is Literal) but if (a*b)->{this is expression};
//        int myMaxValue = 2_147_483_647; //(number can be written in this form as well new feature of java)
//        System.out.println("My Integer Value is :" + myMaxValue/2);
//
//        // short has a width of 16 (Range -32768 to 32767)
//        short myShortValue = 32767;
//        short myNewShortValue = (short) (myShortValue/2); //By default java outputs the end value as an integer, that's why typecasting is required.
//        System.out.println("my New Short Value: " + myNewShortValue);
//
//        // byte has a width of 8 (Range -128 to 127)
//        byte myByte = -124;
//        byte myNewByteValue = (byte) (myByte/2); //By default java outputs the end value as an integer, that's why typecasting is required.
//        System.out.println("My new Byte value is: " + myNewByteValue);
//
//        // long has a width of 64
//        long myLongValue = 9_223_372_036_854_775_807L;
//        long myLongNewValue = (myLongValue/2);
//        System.out.println("My new Long Value is: " + myLongNewValue);
//
//        // Just an extra piece trying to understand the typecasting.
//        byte a = 5;
//        int b = 129;
//        a = (byte) b;
//        System.out.println("value: " + a);

        //Assignment :
        byte myByte = 56;
        short myShort = 1500;
        int myInt = 8999;
        long myLong = 50000L + 10L*(myByte + myInt + myShort);
        System.out.println("value: " + myLong);
        short shortTotal = (short) (1000 + 10 *(myByte + myInt + myInt));
        System.out.println("Short Total is: " + shortTotal);
    }
}
