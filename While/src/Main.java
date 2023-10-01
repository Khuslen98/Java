public class Main {
    public static void main(String[] args) {
        int count = 0;
        int count2 = 0;
        for (int i = 1; i < count; i ++){
            if (i % 3 == 0 && i % 1 == 0) {
                System.out.println(i);
                count2 = count2 + i;
                count++;
                if (count >= 3) {
                    System.out.println("Breaked " + count + "  " + count2);
                    break;
                }
            }
        }
    }
}
