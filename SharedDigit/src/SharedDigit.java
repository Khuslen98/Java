public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false; // Check if both numbers are within the valid range.
        }

        int temp1 = num1;
        int temp2 = num2;

        while (temp1 > 0) {
            int digit1 = temp1 % 10;
            temp2 = num2;

            while (temp2 > 0) {
                int digit2 = temp2 % 10;
                if (digit1 == digit2) {
                    return true;
                }
                temp2 /= 10;
            }

            temp1 /= 10;
        }

        return false; // No shared digit found.
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 43));
    }
}
