package Task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CopyMapToStackExample {
    public static void main(String[] args) {

        Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("Alice", 30);
        sourceMap.put("Bob", 25);
        sourceMap.put("Charlie", 35);


        Stack<Map.Entry<String, Integer>> stack = new Stack<>();


        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            stack.push(entry);
        }

        System.out.println("Source Map: " + sourceMap);
        System.out.println("Stack: " + stack);

    }
}
