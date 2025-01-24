package Day04_OOPS.Level2;

import java.util.ArrayList;
import java.util.List;

// Represents a student who can enroll in multiple courses
class Students {
    String name;
    List<Courses> courses = new ArrayList<>();

    Students(String name) {
        this.name = name;
    }

    void enrollCourse(Courses course) {
        courses.add(course);
        course.addStudent(this);
    }

    void viewCourses() {
        System.out.println("Student: " + name);
        for (Courses course : courses) {
            System.out.println("Enrolled in: " + course.name);
        }
    }
}

// Represents a professor who can teach multiple courses
class Professor {
    String name;
    List<Courses> courses = new ArrayList<>();

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Courses course) {
        courses.add(course);
        course.setProfessor(this);
    }

    void viewCourses() {
        System.out.println("Professor: " + name);
        for (Courses course : courses) {
            System.out.println("Teaches: " + course.name);
        }
    }
}

// Represents a course that can have multiple students and one professor
class Courses {
    String name;
    Professor professor;
    List<Students> students = new ArrayList<>();

    Courses(String name) {
        this.name = name;
    }

    void addStudent(Students student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    void setProfessor(Professor professor) {
        this.professor = professor;
    }

    void viewParticipants() {
        System.out.println("Course: " + name);
        System.out.println("Professor: " + (professor != null ? professor.name : "None"));
        System.out.print("Students: ");
        for (Students student : students) {
            System.out.print(student.name + " ");
        }
        System.out.println();
    }
}

// Main class to demonstrate the relationships and interactions
public class SchoolManagement {
    public static void main(String[] args) {
        // Create students
        Students student1 = new Students("Suresh");
        Students student2 = new Students("Mahesh");

        // Create professors
        Professor professor1 = new Professor("Dr. jagmohan");
        Professor professor2 = new Professor("Dr. Reddy");

        // Create courses
        Courses course1 = new Courses("Math");
        Courses course2 = new Courses("Science");

        // Enroll students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        student1.enrollCourse(course2);

        // Assign professors to courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        // View details
        student1.viewCourses();
        student2.viewCourses();
        professor1.viewCourses();
        professor2.viewCourses();
        course1.viewParticipants();
        course2.viewParticipants();
    }
}
