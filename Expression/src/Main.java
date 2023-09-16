public class Main {
    public static void main(String[] args) {
//        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if (highScore > 25) {
            highScore = highScore + 1000;
            System.out.println("bonus onoog nemeg bodov " + highScore);
        }

        int health = 100;

        if((health > 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
            System.out.println("2 uulaa biylej bainaa");
        }

        System.out.println("second time " + highScore + health);
    }
}
