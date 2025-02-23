package REST;

import java.util.HashMap;

public class Hashsets {
    public static void main(String[] args) {
        // Create a HashMap that stores integer keys and string values
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Retrieve a value using its key
        System.out.println("Key 2: " + map.get(2));  // Output: Banana

        // Print the hash codes of the keys using the map's keys
        System.out.println("Hash code of key 1: " + Integer.valueOf(1).hashCode());  // Output: hash code of 1
        System.out.println("Hash code of key 2: " + Integer.valueOf(2).hashCode());  // Output: hash code of 2
    }
}
