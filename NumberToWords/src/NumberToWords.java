public class NumberToWords {
    public static void numberToWords(int number) {
        if (number >= 0) {

            int reversedNumber = (reverse(number));

            int digitsCounter = getDigitCount(number);

            for (int i = 0; i < digitsCounter; i++) {

                int digit = reversedNumber % 10;

                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

                reversedNumber /= 10;

            }
        }  else {
            System.out.println("Invalid Value");
        }
    }



    public static int reverse(int reversedNumber) {
        int returnedNumber = 0;
        while (reversedNumber != 0) {
            int digit = reversedNumber % 10;
            returnedNumber = returnedNumber * 10 + digit;
            reversedNumber /= 10;
        }

        return returnedNumber;

    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else if (number < 10) {
            return 1;
        } else {
            while (number != 0) {
                number /= 10;
                count++;
            }

        }
        return count;
    }
}

