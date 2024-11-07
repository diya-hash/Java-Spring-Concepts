The Java Collections Framework (JCF) is a unified architecture for representing and manipulating collections in Java. It provides a set of interfaces, implementations, and algorithms that allow developers to handle groups of objects effectively. Here’s a breakdown of its key components:

Key Interfaces
Collection: The root interface for the collection hierarchy. It represents a group of objects, known as elements.

List: An ordered collection (also known as a sequence). It allows duplicate elements and provides positional access. Common implementations include:

ArrayList: Resizable array implementation.

LinkedList: Doubly-linked list implementation.

Set: A collection that does not allow duplicate elements. Common implementations include:

HashSet: Uses a hash table for storage.

TreeSet: Implements the SortedSet interface and uses a red-black tree.

Map: An object that maps keys to values, where each key is unique. Common implementations include:

HashMap: A hash table-based implementation.

TreeMap: A red-black tree-based implementation that orders keys.

Queue: A collection designed for holding elements prior to processing.

Implementations include:

LinkedList: Can be used as a queue. Almost identical to ArrayList.

PriorityQueue: Orders elements based on their natural ordering or a specified comparator.

Key Classes
Collections: A utility class that contains static methods for operating on collections, such as sorting and searching.

Arrays: A utility class for manipulating arrays (e.g., converting arrays to lists).

Algorithms
The framework provides a set of algorithms for manipulating collections, including:

Sorting (using Collections.sort()).

Searching (using Collections.binarySearch()).

Shuffling (using Collections.shuffle()).

Advantages of Using the Collections Framework

Unified Architecture: Provides a standard way to work with groups of objects.

Interoperability: Interfaces allow different implementations to be
interchangeable.

Performance: Well-optimized implementations for various use cases.

Rich Functionality: Offers many methods for manipulating collections.

# Difference between mutable and immutable collections

- Mutable means it can change and immutable means it cannot change. An object is considered immutable if itd state changes after it is constructed. Once an instantiated then its values and properties remain constant throughout. Examples of built-in immutable classes in java: String class, Integer class, etc.

Advanages of immutable classes in java:

1. Thread safety:Since the objects cannot change so, it can be shared among muliple threads without the need for explicit synchronization. Simplifies concurrent programming and race conditions.

2. Predictability and Debugging: The constant state of immutable objects makes code more predictable. Once created, an immutable object’s values remain unchanged, simplifying reasoning about code behavior.

3. Facilitates Caching and Optimization: Immutable objects can be easily cached and reused. Once created, an immutable object’s state does not change, allowing for efficient caching strategies.

# Difference between Synchronized HashMap and Concurrent HashMap

The SynchronizedHashMap allows only one thread to perform read/write operations at a time because all of its methods are declared synchronized. Concurrenthashmap allows multiple threads to work independently on different segments in the map. This allows a higher degree of concurrency in ConcurrentHashMap and thus improves the application’s overall performance.

Let’s identify a few differences between both versions of maps so that we can decide which one to choose in which condition.

- Multiple threads can add/remove key-value pairs from ConcurrentHashMap, while only one thread can change in the case of SynchronizedHashMap. This results in a higher degree of concurrency in ConcurrentHashMap.

- No need to lock the map to read a value in ConcurrentHashMap. A retrieval operation will return the value inserted by the most recently completed insert operation. A lock is required for the read operation, too, in SynchronizedHashMap.

- ConcurrentHashMap does not throw a ConcurrentModificationException if one thread tries to modify it while another is iterating over it. The iterator reflects the state of the map at the time of its creation. SynchronizedHashMap returns Iterator, which fails fast on concurrent modification.

Reference:
[1] https://www.geeksforgeeks.org/priority-queue-class-in-java/
[2] https://www.baeldung.com/java-mutable-vs-immutable-objects
[3] https://howtodoinjava.com/java/collections/hashmap/synchronize-hashmap/#:~:text=The%20SynchronizedHashMap%20allows%20only%20one,different%20segments%20in%20the%20map.
