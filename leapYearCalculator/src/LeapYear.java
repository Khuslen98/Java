public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2024;
        int leap = year % 4;
        System.out.println(leap);
        isLeapYear(year);
        System.out.println(isLeapYear(year));
    }
}
