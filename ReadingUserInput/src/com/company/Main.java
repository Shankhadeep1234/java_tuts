package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of Birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //to handle next line character (such as enter key)

            System.out.println("Enter your name: ");
            String name = scanner.next();
            int age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is: " + name + ", and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of Birth");
            }
        } else {
            System.out.println("Unable to parse your birth year");
        }


        scanner.close();
    }
}
