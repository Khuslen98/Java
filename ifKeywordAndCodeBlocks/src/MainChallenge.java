public class MainChallenge {
    public static void main(String[] args) {

        boolean gameover = true;
        int score = 800;
        int scoreTwo = 5000;
        int levelCompleted = 5;
        int bonus = 50;

        int finalscore = score;

        int highscore = calculateScore(gameover, score, levelCompleted, bonus);
        System.out.println("highscore " + highscore);
        calculateScore(gameover, scoreTwo, levelCompleted, bonus );

        boolean newgameover = true;
        int newscore = 10000;
        int newlevelCompleted = 8;
        int newbonus = 200;

        int newfinalscore = newscore;

        if (newgameover == true) {
            newfinalscore += (newlevelCompleted * newbonus);
            System.out.println("Your final score was " + newfinalscore);
        }
    }
    public static int calculateScore(boolean gameover, int score, int levelCompleted, int bonus){
//        boolean gameover = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 50;

        int finalscore = score;

        if (gameover) {
            finalscore += (levelCompleted * bonus);
        }
        return finalscore;
    }
}
