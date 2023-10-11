public class NumberToWords {
    public static void main(String[] args){
        numberToWords(123);
    }
    public static void numberToWords(int number) {
        if (number < 0){
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < 10; i++){
                int number2 = number % 10;
                if (number2 == i) {
                    if (i == 0) {
                        System.out.println("Zero");
                    } else if (i == 1) {
                        System.out.println("One");
                    } else if (i == 2) {
                        System.out.println("Two");
                    } else if (i == 3) {
                        System.out.println("Three");
                    } else if (i == 4) {
                        System.out.println("Four");
                    } else if (i == 5) {
                        System.out.println("Five");
                    } else if (i == 6) {
                        System.out.println("Six");
                    } else if (i == 7) {
                        System.out.println("Seven");
                    } else if (i == 8) {
                        System.out.println("Eight");
                    } else {
                        System.out.println("Nine");
                    }
                }
            }
        }
    }
}
