public class Main {
    public static void main(String[] args) {
        char charValue = 'a';
        switch (charValue) {
            case 'A' -> System.out.println("A IS able");
            case 'B' -> System.out.println("B IS BAKER");
            case 'C' -> System.out.println("C IS CHARLIE");
            case 'D' -> System.out.println("D IS DOG");
            case 'E' -> System.out.println("E IS EASY");
            default -> System.out.println("Letter " + charValue + " was not found in the switch ");
        }
    }
}
