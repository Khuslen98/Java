public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        } else {
            int largestPrimeFactor = 2;
            while (number > largestPrimeFactor) {
                if (number % largestPrimeFactor == 0) {
                    number = number / largestPrimeFactor;
                } else {
                    largestPrimeFactor++;
                }
            }
            return largestPrimeFactor;
        }
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(200));
    }
}
