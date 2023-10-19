public class SecondAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString( 65, 145));


    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid date for seconds " + seconds;
        } else {
            int minute = seconds / 60;
            int hours = minute / 60;

            int remainingMinutes = minute % 60;

            int remainingSecond = seconds % 60;

            return hours + "h " + remainingMinutes + "m " + remainingSecond + "s ";
        }

    }
    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid date for seconds " + seconds;
        } else {
            int hours = minutes / 60;

            int remainingMinutes = minutes % 60;

            int remainingSecond = seconds % 60;

            return hours + "h " + remainingMinutes + "m " + remainingSecond + "s ";
        }


    }
}
