import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;

        double max = 0;
        String nextNumber1 = scanner.nextLine();
        double number1 = Double.parseDouble(nextNumber1);
        double min = number1;

        do {
            System.out.println("Enter number # " + counter + ":");
            String nextNumber = scanner.nextLine();
            double number = Double.parseDouble(nextNumber);

            try {
//                int number = Integer.parseInt(nextNumber);
                counter++;
                if (max <= number){
                    max = number;
                }
                if (min >= number){
                    min = number;
                }


            } catch (NumberFormatException i) {
                System.out.println("Invalid number");
            }
        } while (counter <= 5);
        System.out.println("The Max number is = " + max);
        System.out.println("The Min number is = " + min);

    }
}
