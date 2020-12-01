public class Main {
    public static void main(String[] args) {

        boolean isTrue = TeenNumberChecker.hasTeen(0, 0, 20);
        System.out.println(isTrue);

        isTrue = TeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println(isTrue);

        isTrue = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println(isTrue);

        boolean isAge = TeenNumberChecker.isTeen(9);
        System.out.println(isAge);

        isAge = TeenNumberChecker.isTeen(13);
        System.out.println(isAge);

        isAge = TeenNumberChecker.isTeen(19);
        System.out.println(isAge);
    }
}
