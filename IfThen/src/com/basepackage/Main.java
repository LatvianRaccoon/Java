package com.basepackage;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared.");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90) ) {
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is a car.");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (isCar) {
            System.out.println("wasCar is true");
        }
    }
}
