public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (double kiloBytes){
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes / 999);
            double megaBytes = (kiloBytes / 1024);
            double remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
            System.out.println(remainingKiloBytes);
            System.out.println(megaBytes);
        }
    }
    public static void main (String[] args){
        double kiloBytes = 2500;
        printMegaBytesAndKiloBytes(kiloBytes);
    }
}
