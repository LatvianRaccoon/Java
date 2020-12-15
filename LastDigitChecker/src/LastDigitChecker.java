public class LastDigitChecker {

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if ((first >= 10 && first <= 1000) && (second >= 10 && second <= 1000) && (third >= 10 && third <= 1000)) {
            int firstLastDigit = first % 10;
            int secondLastDigit = second % 10;
            int thirdLastDigit = third % 10;
            return ((firstLastDigit == secondLastDigit) || (firstLastDigit == thirdLastDigit) || (secondLastDigit == thirdLastDigit));
        }
        return false;
    }

    public static boolean isValid (int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }

        return false;
    }
}
