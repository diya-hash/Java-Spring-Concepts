Constructor:
A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.

Private Constructor:
Private constructors allow us to restrict the instantiation of a class. Simply put, they prevent the creation of class instances in any place other than the class itself.

Uses of Private Constructor:

1. Singleton Pattern

The singleton pattern is one of the most common places we’ll encounter the use of a private constructor. The private constructor allows us to restrict class instantiation to a single object instance.

2. Using Private constructor to Delegate Constructors

Another common use case for private constructors is to provide a means of constructor delegation. Constructor delegation allows us to pass parameters through several different constructors while restricting initialization to specific places.

3. Using Private Constructors to Create Uninstantiable Classes

Uninstantiable classes are classes that we cannot instantiate.

4. Using Private Constructors in the Builder Pattern

The builder pattern allows us to construct complex objects step by step, rather than having several constructors providing different ways to create the object. A private constructor restricts initialization, allowing the builder to manage object creation instead.

5. Using Private Constructors to Prevent Subclassing

Another possible use for private constructors is to prevent subclassing of a class. If we tried to create such as subclass, it would be unable to call the super constructor. However, it’s important to note that we’d normally make a class final to prevent subclassing rather than using a private constructor.

Find all the private constructor examples in the "Pivate Constructor Uses" folder (Constructors -> Private Constructor Uses)


Reference:
[1] https://www.baeldung.com/java-private-constructors
