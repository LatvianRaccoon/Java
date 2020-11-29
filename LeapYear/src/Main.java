public class Main {
    public static void main(String[] args) {
       boolean result = LeapYear.isLeapYear(-1600);
       System.out.println(result);

       result = LeapYear.isLeapYear(1600);
       System.out.println(result);

        result = LeapYear.isLeapYear(2017);
        System.out.println(result);

        result = LeapYear.isLeapYear(2000);
        System.out.println(result);
        }
}
