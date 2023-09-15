public class Hello {
    public static void  main(String[] args) {
        System.out.println("Hello java");
        boolean isAlien = false;
        if (!isAlien){
            System.out.println(false);
            System.out.println("2nd false");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("Your got high score");
        }
        int secondScore = 95;
        System.out.println(topScore);
        System.out.println(secondScore);
        if ((topScore > secondScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
    }
}
