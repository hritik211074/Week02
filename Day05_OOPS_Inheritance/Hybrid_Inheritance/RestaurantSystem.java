package Day05_OOPS_Inheritance.Hybrid_Inheritance;

// Superclass representing a general person
class Person {
    // Data  member of Person class
    String name;

    int id;

    // Constructor to initialize name and ID
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display common information
    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
// Interface representing a worker's duties
interface Worker {
    // Abstract method for performing works
    void performDuties();
}

// Subclass representing a chef
class Chef extends Person implements Worker {
    // Specialty of the chef
    String specialty;

    // Constructor to initialize name, ID, and specialty
    Chef(String name, int id, String specialty) {
        super(name, id); // Call the superclass constructor
        this.specialty = specialty;
    }

    // Implementation of performDuties() for a chef
    @Override
    public void performDuties() {
        // Display common information
        displayInfo();
        System.out.println("Role: Chef, Specialty: " + specialty);
        System.out.println("Duties: Preparing meals and managing the kitchen.");
    }
}

// Subclass representing a waiter
class Waiter extends Person implements Worker {
    // Specific attribute: section assigned to the waiter
    String section;

    // Constructor to initialize name, ID, and section
    Waiter(String name, int id, String section) {
        // Call the superclass constructor
        super(name, id);
        this.section = section;
    }

    // Implementation of performDuties() for a waiter
    @Override
    public void performDuties() {
        displayInfo(); // Display common information
        System.out.println("Role: Waiter, Section: " + section);
        System.out.println("Duties: Taking orders, serving food, and ensuring customer satisfaction.");
    }
}

// Main class to test the restaurant management system
public class RestaurantSystem {
    public static void main(String[] args) {
        // Create objects for Chef and Waiter
        Chef chef = new Chef("Suresh", 101, "punjabi areas");
        Waiter waiter = new Waiter("ramesh", 202, "Outdoor Seating");

        // Perform duties for both roles
        chef.performDuties();

        System.out.println();

        waiter.performDuties();
    }
}

