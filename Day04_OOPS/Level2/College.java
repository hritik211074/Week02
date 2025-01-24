package Day04_OOPS.Level2;

import java.util.ArrayList;
import java.util.List;

// Represents a student who can enroll in multiple courses
class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    // Constructor to initialize the student's name
    Student(String name) {
        this.name = name;
    }

    // Method for the student to enroll in a course
    void enrollCourse(Course course) {
        courses.add(course); // Add course to the student's list of courses
        course.students.add(this); // Add student to the course's list of students
    }

    // Method for the student to view the courses they are enrolled in
    void viewCourses() {
        for (Course course : courses) {
            System.out.println(name + " is enrolled in " + course.name);
        }
    }
}

// Represents a course that can have multiple students enrolled
class Course {
    String name;
    List<Student> students = new ArrayList<>();

    // Constructor to initialize the course's name
    Course(String name) {
        this.name = name;
    }

    // Method to view the students enrolled in the course
    void viewStudents() {
        for (Student student : students) {
            System.out.println(name + " has student " + student.name);
        }
    }
}

// Represents a school that contains multiple students
class School {
    String name;
    List<Student> students = new ArrayList<>();

    // Constructor to initialize the school's name
    School(String name) {
        this.name = name;
    }

    // Method to add a student to the school
    void addStudent(Student student) {
        students.add(student);
    }
}

// Main class to demonstrate the relationships and interactions
public class College{
    public static void main(String[] args) {
        // Create a school
        School school = new School("Government school");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        // Students enroll in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // View enrolled courses for each student
        student1.viewCourses();
        student2.viewCourses();

        // View students enrolled in each course
        course1.viewStudents();
        course2.viewStudents();
    }
}

