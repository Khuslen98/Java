import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int currentYear = 2023;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What is ur Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");
        String birth = System.console().readLine("What year you were born ");
        int age = currentYear - Integer.parseInt(birth);
        return "So you are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
//        String name = System.console().readLine("Hi, What is ur Name? ");
        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");
//        String birth = System.console().readLine("What year you were born ");
        System.out.println("What year you were born ");

        boolean validDob = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDob = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not Allowed!!! Try again. ");
            }
        } while (!validDob);
        return "So you are " + age + " years old";
    }
    public static int checkData(int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        return (currentYear - dob);
    }
}
