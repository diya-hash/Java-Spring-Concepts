public final class immutableObjectExample {

    private final String name;
    private final int age;

    public immutableObjectExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        immutableObjectExample person = new immutableObjectExample("John", 30);
        // person.setName("Jane"); this line has error so it is commented out but is
        // required for explaining the concept of immutability
    }
}
/*
 * The attempt to modify the name of an ImmutablePerson instance will result in
 * a compilation error. This is because the class is designed to be immutable,
 * with no setter methods allowing changes to its state after instantiation.
 * 
 * The absence of setters and the declaration of the class as final ensure the
 * immutability of the object, providing a clear and robust way to handle a
 * constant state throughout its lifecycle.
 */