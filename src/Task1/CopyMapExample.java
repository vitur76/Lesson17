package Task1;

import java.util.HashMap;
import java.util.Map;

public class CopyMapExample {
    public static void main(String[] args) {

        Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("Alice", 30);
        sourceMap.put("Bob", 25);
        sourceMap.put("Charlie", 35);


        Map<String, Integer> destinationMap = new HashMap<>();


        destinationMap.putAll(sourceMap);


        System.out.println("Source Map: " + sourceMap);
        System.out.println("Destination Map: " + destinationMap);
    }
}
