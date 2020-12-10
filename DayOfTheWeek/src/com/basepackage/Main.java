package com.basepackage;

public class Main {

    public static void main(String[] args) {

        printFirstDayOfTheWeek(3);
        printSecondDayOfTheWeek(5);
    }

    public static void printFirstDayOfTheWeek(int firstDay) {
        switch (firstDay) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day");
        }
    }

    public static void printSecondDayOfTheWeek(int secondDay) {

        if (secondDay == 0) {
            System.out.println("Sunday");
        } else if (secondDay == 1) {
            System.out.println("Monday");
        } else if (secondDay == 2) {
            System.out.println("Tuesday");
        } else if (secondDay == 3) {
            System.out.println("Wednesday");
        } else if (secondDay == 4) {
            System.out.println("Thursday");
        } else if (secondDay == 5) {
            System.out.println("Friday");
        } else if (secondDay == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
