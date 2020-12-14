public class EvenDigitSum {

        public static int getEvenDigitSum(int number) {

            int currentDigit;
            int sum = 0;

            if (number < 0) {
                return  -1;
            } else {
                while (number != 0) {
                    currentDigit = number % 10;
                    if (currentDigit % 2 == 0) {
                        sum += currentDigit;
                    }
                    number /= 10;

                }
            }
            return sum;
        }
}
