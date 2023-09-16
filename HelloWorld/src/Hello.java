public class Hello {
    public static void  main(String[] args) {
        System.out.println("Hello java");
        boolean isAlien = false;
        if (!isAlien) {
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
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is error");
        }
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        } else if (!isCar) {
            System.out.println("below here");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar != "Volkswagen" ? true : false;

        boolean isDomestic2 = (makeOfCar == "Volkswagen");
        System.out.println("domestic2 " + isDomestic2);

        if(isDomestic) {
            System.out.println("this is domestic in our country");
        } else if (!isDomestic) {
            System.out.println("this is not domestic");

        }
        int age = 20;
        String ageText = (age >= 18) ? "old" : "young";
        System.out.println(ageText);

        String s = (isDomestic) ? "this car is domestic": "this car is not domestic";
        System.out.println(s);
    }
}
