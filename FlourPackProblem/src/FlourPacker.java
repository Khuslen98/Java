public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        bigCount = bigCount * 5;
        int sum = bigCount + smallCount;
        if((goal % 5) <= smallCount) {
            if (goal < 0){
                return false;
            } else if (sum >= goal){
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(canPack(3, 2 ,-12));

    }
}
