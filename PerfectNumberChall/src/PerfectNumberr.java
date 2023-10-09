public class PerfectNumberr {
    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        } else {
            int number2 = number;
            int sum = 0;
            for(int i = 1; i <= number; i++){
                if (number % i ==0){
                    sum += i;
                }
                if (number2 == sum) {
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
}
