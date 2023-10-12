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
        String birth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(birth);
        return "So you are " + age + " years old";

    }
}
