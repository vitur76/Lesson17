package Task4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class QueueToMapExample {
    public static void main(String[] args) {

        Queue<Map.Entry<String, Integer>> queue = new LinkedList<>();
        queue.add(Map.entry("Alice", 30));
        queue.add(Map.entry("Bob", 25));
        queue.add(Map.entry("Charlie", 35));


        Map<String, Integer> destinationMap = new HashMap<>();


        for (Map.Entry<String, Integer> entry : queue) {
            destinationMap.put(entry.getKey(), entry.getValue());
        }


        System.out.println("Queue: " + queue);
        System.out.println("Destination Map: " + destinationMap);
    }
}
