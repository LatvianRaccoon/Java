package com.basepackage;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            count++;
            System.out.println("Count value is " + count);

        }

         count = 0;
        int number = 4;
        int finishNumber = 20;

        while(number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            count ++;
            System.out.println("Even number " + number);
            if (count == 5) {
                break;
            }

        }
        System.out.println("Total even numbers found = " + count);


    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
