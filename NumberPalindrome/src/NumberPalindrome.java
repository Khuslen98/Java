public class NumberPalindrome {
    public static boolean isPalindrome(int num) {
        int originalNum = Math.abs(num);
        num = Math.abs(num); // Take the absolute value of the number to work with its digits.

        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        isPalindrome(-123456);
    }
}
