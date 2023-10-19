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
        System.out.println(hasSameLastDigit(22, 23, 24));
    }
    public static boolean hasSameLastDigit(int para1, int para2, int para3) {
        if (para1 >= 10 && para1 <=1000 && para2 >= 10 && para2 <=1000 && para3 >= 10 && para3 <=1000){
            para1 = para1 % 10;
            para2 = para2 % 10;
            para3 = para3 % 10;
            if (para1 == para2 || para1 == para3 || para2 == para3){
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
