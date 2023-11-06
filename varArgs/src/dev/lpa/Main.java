package dev.lpa;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello world again");

        String[] sprlitStrings = "Hello world again".split(" ");
        printText(sprlitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();


        String[] sArray = {"first", "Second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
//        System.out.println(textList[1]);
    }
}
