import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        double sum = 0;


        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                counter ++;
               long number = scanner.nextInt();
                sum += number;
            } else {
                break;
            }
            scanner.nextLine();
        }
        long average = Math.round(sum /counter);
        System.out.println("SUM = " + (long) sum + " AVG = " + average);
        scanner.close();

    }
}
