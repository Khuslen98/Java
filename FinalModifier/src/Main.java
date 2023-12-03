//public class Main {
//    static final int x = 10;
//
//    public static void main(String[] args) {
//        Main myObj = new Main();
//
//        System.out.println(x);
//    }
//}

// Java Program to Create An Immutable Class

import java.util.HashMap;
import java.util.Map;

final class Student {

    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;

    public Student(String name, int regNo,
                   Map<String, String> metadata)
    {
        this.name = name;
        this.regNo = regNo;

        Map<String, String> tempMap = new HashMap<>();

        // Iterating using for-each loop
        for (Map.Entry<String, String> entry :
                metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }

        this.metadata = tempMap;
    }

    // Method 1
    public String getName() { return name; }

    // Method 2
    public int getRegNo() { return regNo; }

    // Note that there should not be any setters
    public Map<String, String> getMetadata()
    {

        // Creating Map with HashMap reference
        Map<String, String> tempMap = new HashMap<>();

        for (Map.Entry<String, String> entry :
                this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}

// Class 2
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating Map object with reference to HashMap
        Map<String, String> map = new HashMap<>();

        // Adding elements to Map object
        // using put() method
        map.put("1", "first");
        map.put("2", "second");

        Student s = new Student("ABC", 101, map);

        // Calling the above methods 1,2,3 of class1
        // inside main() method in class2 and
        // executing the print statement over them
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetadata());

        // Uncommenting below line causes error
        // s.regNo = 102;

        map.put("3", "third");
        // Remains unchanged due to deep copy in constructor
        System.out.println(s.getMetadata());
        s.getMetadata().put("4", "fourth");
        // Remains unchanged due to deep copy in getter
        System.out.println(s.getMetadata());
    }
}
