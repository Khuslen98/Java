import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double para1, double para2) {
        int length1 = String.valueOf(para1).length();
        int length2 = String.valueOf(para2).length();
        System.out.println(length2 + " jvghvjgh " + length1);
        if (para1 == 0 || para2 == 0) {
            return true;


        } else if (length1 > 4 && length2 > 4) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        double para1 = 3.175;
        double para2 = 3.175;
//        areEqualByThreeDecimalPlaces();
        System.out.println(areEqualByThreeDecimalPlaces(para1, para2));
    }
    public static boolean areEqualByThreeDecimalPlaces2(double num1, double num2) {
        // Multiply both numbers by 1000 to shift three decimal places to the left
        int scaledNum1 = (int) (num1 * 1000);
        int scaledNum2 = (int) (num2 * 1000);

        // Compare the scaled numbers for equality
        return scaledNum1 == scaledNum2;
    }
}
