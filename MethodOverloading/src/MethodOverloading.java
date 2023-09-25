public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Khuslen", 500 );
        System.out.println("New score is " + newScore);
        int SecondScore = calculateScore(75);
        System.out.println(SecondScore);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points ");
        return score * 1000;
    }
    public static int calculateScore(int score){
        return calculateScore("anonomys", score);
    }
    public static int calculateScore(){
        System.out.println("No player Name, No score ");
        return 0;
    }

}
