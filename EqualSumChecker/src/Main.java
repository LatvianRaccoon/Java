public class Main {
    public static void main(String[] args) {
        boolean isTrue = EqualSumChecker.hasEqualSum(1, 1, 1);
        System.out.println(isTrue);

        isTrue = EqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println(isTrue);

        isTrue = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println(isTrue);


    }
}
