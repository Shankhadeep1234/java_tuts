package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;
        int myMinIntegerValue = Integer.MIN_VALUE;
        int myMaxIntegerValue = Integer.MAX_VALUE;
        System.out.println("Integer min value :" + myMinIntegerValue);
        System.out.println("Integer max value :" + myMaxIntegerValue);

        int myMaxIntTest = 21_474_83_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value :" + myMinByteValue);
        System.out.println("Byte max value :" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value :" + myMinShortValue);
        System.out.println("Short max value :" + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value :" + myMinLongValue);
        System.out.println("Long max value :" + myMaxLongValue);

        long myLongValue = 100;
        System.out.println(myLongValue);
    }
}
