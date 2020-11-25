package com.basepackage;

public class Main {

    public static void main(String[] args) {

        double firstValue = 20.00d;
        double secondValue = 80.00d;

        double total = 100.00d * (firstValue + secondValue);
        double remainder = total % 40.00d;

        boolean isRemainderZero = true;
        if (remainder == 0) {
            System.out.println(isRemainderZero);
        } else {
            System.out.println("Got some remainder");
        }
    }
}
