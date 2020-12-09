public class Main {
    public static void main(String[] args) {
        boolean isTrue = PlayingCat.isCatPlaying(true, 10);
        System.out.println(isTrue);

        isTrue = PlayingCat.isCatPlaying(false, 36);
        System.out.println(isTrue);

        isTrue = PlayingCat.isCatPlaying(false, 35);
        System.out.println(isTrue);
    }
}
