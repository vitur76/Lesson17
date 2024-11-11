package Task2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CopyMapToQueueExample {
    public static void main(String[] args) {

        Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("Alice", 30);
        sourceMap.put("Bob", 25);
        sourceMap.put("Charlie", 35);


        Queue<Map.Entry<String, Integer>> destinationQueue = new LinkedList<>();


        destinationQueue.addAll(sourceMap.entrySet());


        System.out.println("Source Map: " + sourceMap);
        System.out.println("Destination Queue (Map.Entry): " + destinationQueue);
    }
}
