package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2021";
        System.out.println("numberAsString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("Number= " + number);

        System.out.println("***************");

        number += 1;
        numberAsString += 1;
        System.out.println("numberAsString= " + numberAsString);
        System.out.println("Number= " + number);
    }
}
