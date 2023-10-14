public class Main {
    public static void main(String[] args) {
        Test(0);
        aMethod(3);
    }
    public static void Test(int number){
        while (number < 15) {
            number++;
            if (number <= 5) {
                System.out.println("Skipping number " + number);
                continue;
            }
            System.out.println("number " + number);
            if (number >= 10) {
                System.out.println("Breaking at " + number);
                break;
            }
        }
    }
    public static void aMethod(int value) {
        switch (value) {
            case 1:
                System.out.println("i");
                break;
            case 2:
                int i = 10;
                System.out.println(i);
                break;
            default:
                i = value;
                System.out.println(i);
                break;
        }
    }
}
