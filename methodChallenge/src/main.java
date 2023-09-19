public class main {
    public static void main (String[] args) {
        String name = "tim";
        int position = -100;
        calculateHighScorePosition(position);
        System.out.println("Tim managed to get into position 2 on the high score list");
    }

    public static void calculateHighScorePosition(int position) {
        if (position >= 1000) {
            System.out.println("1");
        } else if (position >= 500 && position < 1000) {
            System.out.println("2");
        } else if (position >= 100 && position < 500){
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}

