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
        switch (value){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3, a 4 or a 5");
                System.out.println("Actually " + value);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
    }
}
