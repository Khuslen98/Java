public class Main {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printWeekday(0);
    }
    public static void printDayOfWeek(int param) {
        String dayOfWeek = switch (param) {
            case 1 -> {yield "Monday";}
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 0 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(param + " stands for " + dayOfWeek);
    }
    public static void printWeekday(int param) {
        if (param == 1) {
            System.out.println("Monday");
        } else if (param == 2) {
            System.out.println("Tuesday");
        } else if (param == 3) {
            System.out.println("Wednesday");
        } else if (param == 4) {
            System.out.println("Thursday");
        } else if (param == 5) {
            System.out.println("Friday");
        } else if (param == 6) {
            System.out.println("Saturday");
        } else if (param == 0) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
