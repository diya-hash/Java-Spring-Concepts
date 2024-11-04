import java.util.PriorityQueue;
import java.util.*;

public class priorityQueueExample {
    public static void main(String[] args) {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());

        // Operations on PQ:
        PriorityQueue<Integer> pq0 = new PriorityQueue<>();
        for (int i = 0; i < 3; i++) {
            pq0.add(i);
            pq0.add(1);
        }
        System.out.println(pq0);

        PriorityQueue<String> pq2 = new PriorityQueue<>();

        pq2.add("Geeks");
        pq2.add("For");
        pq2.add("Geeks");

        System.out.println(pq2);

        // Remove elements:
        PriorityQueue<String> pq3 = new PriorityQueue<>();

        pq3.add("Geeks");
        pq3.add("For");
        pq3.add("Geeks");

        System.out.println("Initial PriorityQueue " + pq3);

        // using the method
        pq3.remove("Geeks");

        System.out.println("After Remove - " + pq3);

        System.out.println("Poll Method - " + pq3.poll());

        System.out.println("Final PriorityQueue - " + pq3);

        // Accessing the Elements:
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println("Initial PriorityQueue " + pq);

        // using the method
        pq.remove("Geeks");

        System.out.println("After Remove - " + pq);

        System.out.println("Poll Method - " + pq.poll());

        System.out.println("Final PriorityQueue - " + pq);

        // Iterating the method:

        PriorityQueue<String> pq4 = new PriorityQueue<>();

        pq4.add("Geeks");
        pq4.add("For");
        pq4.add("Geeks");

        Iterator iterator = pq4.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // Create a priority queue with initial capacity 10
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(10);

        // Add elements to the queue
        pq1.add(3);
        pq1.add(1);
        pq1.add(2);
        pq1.add(5);
        pq1.add(4);

        // Print the queue
        System.out.println("Priority queue: " + pq1);

        // Peek at the top element of the queue
        System.out.println("Peek: " + pq1.peek());

        // Remove the top element of the queue
        pq1.poll();

        // Print the queue again
        System.out.println("Priority queue after removing top element: " + pq1);

        // Check if the queue contains a specific element
        System.out.println("Does the queue contain 3? " + pq1.contains(3));

        // Get the size of the queue
        System.out.println("Size of queue: " + pq1.size());

        // Remove all elements from the queue
        pq1.clear();

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + pq1.isEmpty());
    }
}
/*
 * Time and Space Complexities:
 * Time Complexity: O(log n)
 * Space Complexity: O(n), where n is the number of elements in the priority
 * queue.
 * We will not get sorted elements by printing PriorityQueue.
 * 
 * Time complexity for accessing elements:
 * Time Complexity: O(1)
 * Space Complexity: O(n), where n is the number of elements in the priority
 * queue.
 * 
 * Time complexity for iterating the pq:
 * Time Complexity: O(n)
 * Space Complexity: O(1) per iteration, where n is the number of elements in
 * the priority queue.
 */