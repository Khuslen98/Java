public class TeenNumberChecker {

    public static boolean hasTeen(int para1, int para2, int para3) {
        if (para1 >= 13 && para1 <= 19) {
            return true;
        } else if (para2 >= 13 && para2 <= 19) {
            return true;
        } else if (para3 >= 13 && para3 <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int para) {
        return para >= 13 && para <= 19;
    }

    public static void main(String[] args) {
        int para1 = 0;
        int para2 = 0;
        int para3 = 13;
        hasTeen(para1, para2, para3);
        System.out.println(hasTeen(para1, para2, para3));
    }
}
