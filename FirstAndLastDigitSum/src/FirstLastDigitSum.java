public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int firstDigit = number;
        int lastDigit;

        if (firstDigit < 0) {
            return -1;
        } else {
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }

             lastDigit = number % 10;
        }
        return firstDigit + lastDigit;
    }

}
