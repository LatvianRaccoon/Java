public class EqualSumChecker {
    public static boolean hasEqualSum(int firstValue, int secondValue, int thirdValue) {
        int sum = firstValue + secondValue;

        if (sum == thirdValue) {
            return true;
        } else {
            return false;
        }
    }
}
