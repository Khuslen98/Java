package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

//    public static void main(String[] args) {
//
//        int[] myArray = {10, 35, 20, 17, 18};
//        for (int myInt : myArray) {
//            System.out.println("value = " + myInt);
//        }
    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(new int[]{7, 30, 35});
        System.out.println(Arrays.toString(sortedArray));
    }
    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] randomArray = new int[len];
        for (int i = 0; i < len; i++ ){
            randomArray[i] = random.nextInt(1000);

        }
        return randomArray;
    }
    private static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);

        System.out.println(Arrays.toString(array));

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;

                    System.out.println("-------->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("--------->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
