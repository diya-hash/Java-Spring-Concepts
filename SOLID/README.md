# Java-SpringBoot-Practical-Concepts

SOLID Principle:
S - Single responsibility
O - Open / Closed
L - Liskov Principle
I - Inversion Control
D - Dependency Inversion

Single Responsibility: The class or Method should focus on one concept or problem. For example if a class is to focus on a circle then it should only have methods that is related to a circle. For instance, the class can have methods on calculating the radius, diamter, or the degrees of the circle but not the area of a square. When it comes to a method, it should focus on only one problem or output. So in this case, if the method is to calculate the diamater of a circle then it should only calcu;late that and not the rasdius of the circle. This enables loose coupling

Open / Closed - The component is open for extension but closed for modification. Hint: Interfaces are used commonly for this principle.

Liskov Principle -

Interface Seggregation - The principle which enforces to build small and focused interfaces that doesn't force the implementer of the interface to implement unneccesary implementations/behavious that they do not need.

Reference:
[1] https://www.freecodecamp.org/news/introduction-to-solid-principles/
