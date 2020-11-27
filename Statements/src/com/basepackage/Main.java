package com.basepackage;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is test!");

        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50;myVariable--;System.out.println("This is another one");
        // not good practice!!!
    }
}
