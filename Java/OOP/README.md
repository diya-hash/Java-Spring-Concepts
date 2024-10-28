Core concepts of OOP

Class: A blueprint or template for creating objects. It defines properties (attributes) and methods (functions).

Object: An instance of a class. It contains actual data and can perform operations defined by its class.

Encapsulation:
The bundling of data (attributes) and methods (functions) that operate on the data within a single unit or class. It restricts direct access to some components, which helps prevent unintended interference and misuse.

Abstraction:
Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods.
The process of simplifying complex systems by modeling classes based on essential characteristics while hiding unnecessary details. This allows programmers to focus on interactions at a high level.

Inheritance:
In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.
A mechanism where a new class (derived or child class) inherits properties and behaviors (methods) from an existing class (base or parent class). This promotes code reusability and establishes a hierarchical relationship between classes.

Polymorphism:
The ability to present the same interface for different underlying forms (data types). It allows methods to do different things based on the object it is acting upon. This can be achieved through method overriding (in subclasses) and method overloading (same method name with different parameters).

Composition:
A design principle where a class is composed of one or more objects from other classes. It allows for building complex types by combining simpler ones, enhancing modularity and flexibility.
Aggregation and Association:

Association: A relationship between two classes where one class uses or interacts with another.

Aggregation: A special form of association representing a "whole-part" relationship, where the part can exist independently of the whole.

############ Advantages and Disadvantages of Encapsulation ###########

Advantages of Encapsulation

Data Hiding: it is a way of restricting the access of our data members by hiding the implementation details. Encapsulation also provides a way for data hiding. The user will have no idea about the inner implementation of the class. It will not be visible to the user how the class is storing values in the variables. The user will only know that we are passing the values to a setter method and variables are getting initialized with that value.

Increased Flexibility: We can make the variables of the class read-only or write-only depending on our requirements. If we wish to make the variables read-only then we have to omit the setter methods like setName(), setAge(), etc. from the above program or if we wish to make the variables write-only then we have to omit the get methods like getName(), getAge(), etc. from the above program

Reusability: Encapsulation also improves the re-usability and is easy to change with new requirements.

Testing code is easy: Encapsulated code is easy to test for unit testing.
Freedom to programmer in implementing the details of the system: This is one of the major advantage of encapsulation that it gives the programmer freedom in implementing the details of a system. The only constraint on the programmer is to maintain the abstract interface that outsiders see.

Reference:
[1] https://www.geeksforgeeks.org/encapsulation-in-java/
