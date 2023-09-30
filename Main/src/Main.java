public class Main {
    public static void main(String[] args) {
        int value = 5;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value ==2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was 3, a 4 or a 5");
                System.out.println("Actually " + value);
            }
            case 9 -> {
                System.out.println("it's nine");
            }
            default -> System.out.println("Value was not 1 or 2");
        }
        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter ");
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
