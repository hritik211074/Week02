package Day05_OOPS_Inheritance.Hierarchical_Inheritance;

// Superclass representing a general person
class Person {
    // Data members of Person class
    String name;
    int age;

    // Constructor to initialize name and age
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display common information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass representing a teacher
class Teacher extends Person {
    // Data member of Teacher and basically subject is taught by tacher
    String subject;

    // Constructor to initialize name, age, and subject
    Teacher(String name, int age, String subject) {
        // Call the superclass constructor
        super(name, age);
        this.subject = subject;
    }

    // Method to display the role of the teacher

    void displayRole() {
        super.displayInfo(); // Display common information
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}

// Subclass representing a student
class Student extends Person {
    // Specific attribute: grade of the student
    String grade;

    // Constructor to initialize name, age, and grade
    Student(String name, int age, String grade) {
        // Call the superclass constructor
        super(name, age);
        this.grade = grade;
    }

    // Method to display the role of the student
    void displayRole() {
        // Display common information
        super.displayInfo();
        System.out.println("Role: Student, Grade: " + grade);
    }
}

// Subclass representing a staff member
class Staff extends Person {
    String department;

    // Constructor to initialize name, age, and department
    Staff(String name, int age, String department) {
        // Call the superclass constructor
        super(name, age);
        this.department = department;
    }

    // Method to display the role of the staff member
    void displayRole() {
        super.displayInfo();
        System.out.println("Role: Staff, Department: " + department);
    }
}

// Main class to test the school system
public class SchoolSystem {
    public static void main(String[] args) {
        // Create objects for each role
        Teacher teacher = new Teacher("suresh", 30, "Mathematics");
        Student student = new Student("ramesh", 16, "10th Grade");
        Staff staff = new Staff("rakesh", 40, "Administration");

        // Display roles of each person
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}

