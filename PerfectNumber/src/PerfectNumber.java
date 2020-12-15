public class PerfectNumber {
        public static boolean isPerfectNumber(int number) {

            int sum = 0;
            int perfectNumber;
            if (number < 1) {
                return false;
            } else {
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        sum += i;
                    }
                }
                perfectNumber = sum - number;
                if (perfectNumber == number) {
                    return true;
                }
            }
            return false;
        }
}
