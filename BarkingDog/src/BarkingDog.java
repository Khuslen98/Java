public class BarkingDog {
    public static boolean shouldAwake(boolean barking, int hourR) {
        if (hourR < 0 || hourR > 23) {
            return false;
        } else if (barking && (hourR < 8 && hourR > 22)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main (String[] args) {
        boolean barking = true;
        int hourR = 6; // Example hour of the day

        boolean shouldWakeUp = shouldAwake(barking, hourR);

        System.out.println("Should I wake up? " + shouldWakeUp);
    }
}
