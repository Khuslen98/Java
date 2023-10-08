public class HasDigit {

    public static void main(String[] args) {
        System.out.println(isValid(9));
    }
    public static boolean hasSameLastDigit(int para1, int para2, int para3) {
        if (para1 >= 10 || para1 <=1000 && para2 >= 10 || para2 <=1000 && para3 >= 10 || para3 <=1000){
            para1 = para1 % 10;
            para2 = para2 % 10;
            para3 = para3 % 10;
            if (para1 == para2 || para1 == para3 || para2 == para3){
                return true;
            }
            return true;
        } else {
            return false;
        }
    }
    public static boolean isValid(int para) {
        if (para >= 10 || para <=1000){
            return true;
        } else {
            return false;
        }
    }
}
