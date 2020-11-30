public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble) {

        firstDouble = firstDouble * 1000;
        int firstInt = (int) firstDouble;

        secondDouble = secondDouble * 1000;
        int secondInt = (int) secondDouble;

        if (firstInt == secondInt) {
            return true;
        } else {
            return false;
        }
    }
}
