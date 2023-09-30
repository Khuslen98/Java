public class MinutesToYearDaysCalculator {
    public static void printYearsAndDays(long minutes){

        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 1440;
            long years = days / 365;
            long remain = days % 365; //uldegdel avah arga
            System.out.println( minutes + " = " + years + "y and " + remain + " d");
        }
    }
}
