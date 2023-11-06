package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        readIntegers(6);
        System.out.println(Arrays.toString(readElements(5)));

    }
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int elements = scanner.nextInt();
        return elements;
    }

    private static int[] readElements(int count) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }
    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el: array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
}
