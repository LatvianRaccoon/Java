package com.basepackage;

public class Main {

    public static void main(String[] args) {

        byte newByte = 10;
        short newShort = 100;
        int newInt = 10000;

        long newLong = 50000L + 10L * (newByte + newShort + newInt);

        System.out.println(newLong);
    }
}
