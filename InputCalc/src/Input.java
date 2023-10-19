import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }


        public static void inputThenPrintSumAndAverage() {
            Scanner scanner = new Scanner(System.in);

            long counter = 0;
            long sum = 0;

            while (counter < 6) {

                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    sum += number;
                    counter++;
                } else {

                }
                scanner.nextLine(); // Consume the newline character
            }

            scanner.close();

            if (counter > 0) {
                long average = Math.round((double) sum / counter);
                System.out.println("SUM = " + sum + " AVG = " + average);
            } else {
                System.out.println("No valid numbers entered.");
            }
        }


}
