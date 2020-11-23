package com.basepackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please Enter Number Of Pounds!");

        Scanner scan = new Scanner(System.in);

            double pounds = scan.nextDouble();
            double convertedKg = pounds * 0.45359237;

            System.out.println("Converted Kilograms = " + convertedKg);
    }
}
