package Day02_OOPS.Level1_practice_problem;

// Course class definition
public class Course {
    // Instance variables
    private String courseName;
    private int duration;
    private double fee;

    // Class variable (common for all courses)
    private static String instituteName;

    // Default constructor
    public Course() {
        this.courseName = "Unknown";
        this.duration = 0;
        this.fee = 0.0;
    }

    // Parameterized constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
    }

    // Class method to update the institute name for all courses
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

}

// Example usage
 class CourseWork {
    public static void main(String[] args) {
        // Updating the institute name for all courses
        Course.updateInstituteName("Tech Institute");

        // Creating courses using the parameterized constructor
        Course course1 = new Course("Java Programming", 6, 1200.00);
        Course course2 = new Course("Data Science", 4, 1500.00);

        // Displaying course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();

    }
}

