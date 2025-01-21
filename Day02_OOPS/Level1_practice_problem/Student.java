package Day02_OOPS.Level1_practice_problem;

// Student class definition
public class Student {
    // Public attribute
    public int rollNumber;

    // Protected attribute
    protected String name;

    // Private attribute
    private double CGPA;

    // Default constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// PostgraduateStudent subclass
class PostgraduateStudent extends Student {
    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        displayStudentDetails();
    }
}

// Example usage
class Detail {
    public static void main(String[] args) {
        // Creating a student using the Student class
        Student student = new Student(191, "Sukhi", 3.8);
        student.displayStudentDetails();

        // Creating a postgraduate student using the PostgraduateStudent class
        PostgraduateStudent postgraduateStudent = new PostgraduateStudent(102, "shakshi", 3.9);
        postgraduateStudent.displayPostgraduateDetails();
    }
}

