public class Main {
    public static void main(String[] args) {
        printInformation("qwertyuio");
        printInformation("");
        printInformation("\t    \n");

        String helloworld = "Hello World";
        System.out.printf("index of r = %d %n ", helloworld.indexOf("r"));
        System.out.printf("index of World = %d %n ", helloworld.indexOf("World"));

        System.out.printf("index of l = %d %n ", helloworld.indexOf("l"));
        System.out.printf("index of l = %d %n ", helloworld.lastIndexOf("l"));

        //from index гэдэг утга нь үүнээс хойшоо хайх хэрэгтэй гэсэн санааг оруулж өгж байна.
        System.out.printf("index of l = %d %n ", helloworld.indexOf("l", 3));
        System.out.printf("index of l = %d %n ", helloworld.lastIndexOf("l", 8));

        String helloworldLower = helloworld.toLowerCase();
        if (helloworld.equals(helloworldLower)){
            System.out.println("Value exactly matching");
        }
        if (helloworld.equalsIgnoreCase(helloworldLower)){
            System.out.println("Values match ignoring case");
        }
        if (helloworld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloworld.endsWith("World")) {
            System.out.println("String end with World");
        }
        if (helloworld.contains("World")) {
            System.out.println("String contains World");
        }
        if (helloworld.contentEquals("Hello World")){
            System.out.println("Value exactly matching");
        }

    }

    public static void printInformation(String string) {

        int length = string.length();
        System.out.printf("Length = %d %n ", length);

        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is blank");
            return;
        }
            System.out.printf("First Char = %c %n" , string.charAt(0));
            System.out.printf("Second Char = %c %n" , string.charAt(length - 8));



    }
}