package Day02_OOPS.Level1_practice_problem;

// Circle class definition
public class Circle {
    // Attribute
    private double radius;

    // Default constructor
    public Circle() {
        // Initialize radius with a default value
        this(1.0);   // Calls the parameterized constructor with a some value
    }

    // Parameterized constructor
    public Circle(double radius) {
        // Initialize radius with the provided value
        this.radius = radius;
    }
}
// Example usage
 class problem {
    public static void main(String[] args) {
        // Creating a circle with default constructor
        Circle defaultCircle = new Circle();


        // Creating a circle with parameterized constructor
        Circle userCircle = new Circle(5.0);
    }
}
