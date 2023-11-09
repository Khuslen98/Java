package de.lpa;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        boolean flag = true;
        while(flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
        }
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

    }

    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add item(s) separate items by comma[]");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));
        for (String i: items) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Name please(separate by comma)");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));
        for (String i: items) {
            String trimmed = i.trim();
            groceries.remove((trimmed));
        }
    }

    private static void printActions() {
        String textblock = """
                Available actions:
                
                0 - Shut down;
                
                1 - to add items (s) (comma delimited list)
                
                2 - to remove any items  (comma delimited list) 
                
                Enter number of actions you want to do.
                """;
        System.out.println(textblock + " ");
    }
}
