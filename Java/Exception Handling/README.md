# Exception Handling

Powerful mechanism in Java to handle runtime errors to prevent interruption of the normal flow of work of an application.

# Exception in Java

An unusual event that occurs during the execution of a program. It can disrupt the flow of instructions of an application. Examples include:

- Invalid User input
- file not found
- division by zero

# Exception Handling

Mechanism to handle runtime errors, such as:

- ClassNotFoundException
- IOException
- SQLException
- RemoteException

# Hierarchy Of Java Exception Classes

java.lang.Throwable class is the root of Java Exception hierarchy which is inherited by two subclasses: Exception and Error

# Types of Java Exceptions

Exceptions are categorized into two main types and a third category:

1. Checked Exceptions
2. Unchecked Exceptions
3. Errors

# Checked Exceptions

Exceptions that are checked at compile-time. This means that the compiler verifies that the code handles these exceptions either by catching them or declaring them in the method signature using the throws keyword. Examples of checked exceptions include:

1. IOException: Thrown when an input/output operation fails. Such as when reading or writing to a file.

2. SQLException: Occurs when there is an error while accessing a database.

3. ParseException: Indicates a problem while parsing a string into another data type, such as parsing a date.

4. ClassNotFoundException: Thrown when an application tries to load a class through its string name using methods like Class.forName(), but the class with the specified name cannot be found in the classpath.
