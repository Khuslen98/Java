public class MainChallenge {
    public static void main(String[] args) {

        boolean gameover = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 50;

        int finalscore = score;

        if (gameover == true) {
            finalscore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalscore);
        }
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
}
