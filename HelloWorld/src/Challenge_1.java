public class Challenge_1 {

    public static void  main(String[] args) {
        double twenty = 20.00d;
        double eigthy = 80.00d;
        double hundred = (twenty + eigthy) * 100.00d;
        System.out.println("hundred  " + hundred);
        double remainder = hundred % 40.00d;
        System.out.println("remainder " + remainder);
        boolean isNoRemainder = (remainder == 0);
        System.out.println(isNoRemainder);
        if (isNoRemainder) {
            System.out.println("Got some reminder");
        }
    }
}
