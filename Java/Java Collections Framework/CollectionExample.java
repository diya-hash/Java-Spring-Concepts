import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExample {
    public static void main(String[] args) {
        // Using a List
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Names: " + names);

        // Using a Map
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        System.out.println("Age of Alice: " + ageMap.get("Alice"));
    }
}

/*
 * This example demonstrates basic operations with
 * ArrayList and HashMap. The Java Collections Framework is powerful
 * and widely used in Java programming for its flexibility and efficiency.
 */