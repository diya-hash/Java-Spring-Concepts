// In this example, we’ve created an Employee class that holds the name, age, and department of an employee:

public class Employee {

    private final String name;
    private final int age;
    private final String department;

    private Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
}
// As we can see, we’ve made the Employee constructor private – therefore, we cannot instantiate the class explicitly.

// We’ll now add an inner Builder class to the Employee class:
public static class Builder {

    private String name;
    private int age;
    private String department;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Employee build() {
        return new Employee(name, age, department);
    }
}
// The builder can now create different employees with a name, age, or department – there’s no constraint on how many fields we must provide:
Employee.Builder emplBuilder = new Employee.Builder();

Employee employee = emplBuilder
  .setName("baeldung")
  .setDepartment("Builder Pattern")
  .build();

// We’ve created an Employee with a name of “baeldung” and a department of “Builder Pattern“. Age is not provided, so the default primitive int value of 0 will be used.