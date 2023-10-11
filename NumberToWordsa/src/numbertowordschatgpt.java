public class numbertowordschatgpt {
    public static void main(String[] args){
        numberToWords(123);
    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reverseNumber = reverse(number);
            int digitCount = getDigitCount(number);
            int reversedDigitCount = getDigitCount(reverseNumber);

            while (reversedDigitCount > 0) {
                int lastDigit = reverseNumber % 10;
                reverseNumber /= 10;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        break;
                }

                reversedDigitCount--;
            }

            // If the original number had more digits, print "Zero" for the remaining digits.
//            while (digitCount > getDigitCount(reverseNumber)) {
//                System.out.println("Zero");
//                digitCount--;
//            }
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1; // Invalid value
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

}
