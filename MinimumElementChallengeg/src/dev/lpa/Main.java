package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        readIntegers(6);
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }
    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " +  " integer values:\r");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i <splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }
    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el: array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
}
