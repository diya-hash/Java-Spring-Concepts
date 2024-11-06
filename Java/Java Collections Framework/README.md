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

Reference:
[1] https://www.geeksforgeeks.org/priority-queue-class-in-java/
[2] https://www.baeldung.com/java-mutable-vs-immutable-objects
