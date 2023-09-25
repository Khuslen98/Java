public class Method {
    public static void main(String[] args){
        converToCentimeters(5, 8);
    }
    public static double converToCentimeters(double height){
        return height;
    }
    public static double converToCentimeters(int heigh, int inches){
        heigh = heigh * 12 + inches;
        double height = (double) heigh * 2.54;
        double result = converToCentimeters(height);
        System.out.println(height);
        return result ;
    }
}
