public class NumberInWord {
    public static void main(String[] args){
        printNumberInWord(-15);
    }
    public static void printNumberInWord(int number) {
        String word;
        switch (number) {
            case 1:
                word = "ONE";
                break;
            case 2:
                word = "TWO";
                break;
            case 3:
                word = "THREE";
                break;
            case 4:
                word = "FOUR";
                break;
            case 5:
                word = "FIVE";
                break;
            case 6:
                word = "SIX";
                break;
            default:
                word = "OTHER";
                break;
        }
        System.out.println(word);
    }

}
