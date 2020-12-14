public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int copyNumber = 0;
        int currentDigit = 0;
        int reversedNumber = 0;
        copyNumber = number;

        do {
            currentDigit = copyNumber % 10;
            reversedNumber = (reversedNumber * 10) + currentDigit;
            System.out.println(reversedNumber);
            copyNumber /= 10;
        } while (copyNumber != 0);
            if (number == reversedNumber) {
                return true;
            } else {
                return false;
            }


    }
}
