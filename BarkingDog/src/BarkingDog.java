public class BarkingDog {
    public static boolean shouldAwakeUp(boolean barking, int hourR) {
        if (hourR < 0 || hourR > 23) {
            return false;
        } else if (barking && (hourR < 8 || hourR > 22)) {
            return true;
        } else {
            return false;
        }
    }
}
