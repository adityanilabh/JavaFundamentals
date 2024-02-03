package CollectionJava.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        Map<Integer, String> map = new HashMap<>();

        // Adding entries to the HashMap
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // Accessing elements
        System.out.println("Value at key 1: " + map.get(1));

        // Iterating through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Check if a key exists
        int keyToCheck = 2;
        if (map.containsKey(keyToCheck)) {
            System.out.println("Key " + keyToCheck + " exists in the HashMap.");
        } else {
            System.out.println("Key " + keyToCheck + " does not exist in the HashMap.");
        }

        // Check if a value exists
        String valueToCheck = "Java";
        if (map.containsValue(valueToCheck)) {
            System.out.println("Value '" + valueToCheck + "' exists in the HashMap.");
        } else {
            System.out.println("Value '" + valueToCheck + "' does not exist in the HashMap.");
        }

        // Remove an entry
        int keyToRemove = 3;
        map.remove(keyToRemove);
        System.out.println("HashMap after removing key " + keyToRemove + ": " + map);
    }
}
