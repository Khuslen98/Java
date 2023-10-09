public class FactorPrinter {
    public static void printFactors(int param) {
        if (param < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= param; i++) {
                if (param % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printFactors(10);
    }
}
