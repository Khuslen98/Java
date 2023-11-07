package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        readIntegers(6);
//        System.out.println(Arrays.toString(readElements(5)));
        int[] array = {5, 3, 2, 12, 32};
            reverseArray(array);
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

    private static int reverseArray(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println(Arrays.toString(array));
        }
        return maxIndex;
    }
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

}
