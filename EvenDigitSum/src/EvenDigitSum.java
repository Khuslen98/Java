public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number != 0) {
            int number2 = number % 10;
            if (number2 % 2 == 0 ){
                sum += number2;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main (String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }
}
