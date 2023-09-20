public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-10);
        checkNumber(0);
        checkNumber(1);
    }
    public static void checkNumber(int Number) {
        if(Number > 0 ){
            System.out.println("Positive");

        } else if (Number < 0) {
            System.out.println("Negative");

        } else {
            System.out.println("Zero");
        }
    }
}
