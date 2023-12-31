package dev.lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] originalArray = new String[] {"first", "second", "third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("List: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.reverseOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

//        originalList.remove(0);

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

    }
}
