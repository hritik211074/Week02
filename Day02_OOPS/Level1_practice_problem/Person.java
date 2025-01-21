package Day02_OOPS.Level1_practice_problem;

// Person class definition
public class Person {
    // Attributes
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }


}

// Example usage
class MainPerson {
    public static void main(String[] args) {
        // Creating a person using the parameterized constructor
        Person originalPerson = new Person("Alice", 30, "123 Main Street");

        // Creating a copy of the person using the copy constructor
        Person copiedPerson = new Person(originalPerson);

        // Displaying information
        System.out.println("Original Person: " + originalPerson);
        System.out.println("Copied Person: " + copiedPerson);
    }
}

