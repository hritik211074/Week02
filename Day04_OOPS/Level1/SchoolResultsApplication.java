package Day04_OOPS.Level1;

import java.util.ArrayList;
import java.util.List;

// Here a details of Student class
    class Student {
    private int studentId;
    private String name;
    private List<Subject> subjects;

    // Constructor to initialize the data member's of Student
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.subjects = new ArrayList<>();
    }
    // Adding the subject for particular students
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
    // Removing the subject for particular student
    public void removeSubject(Subject subject) {
        subjects.remove(subject);
    }
    // Returning all the subject for particular student
    public List<Subject> getSubjects() {
        return subjects;
    }

    // Getting the name of student
    public String getName() {
        return name;
    }
}

//Here a details of Subject class
class Subject {
    private int subjectId;
    private String name;
    private double score;

    // constructor to initialize the data members of Student class
    public Subject(int subjectId, String name, double score) {
        this.subjectId = subjectId;
        this.name = name;
        this.score = score;
    }
    //Here we are getting the score of each subject
    public double getScore() {
        return score;
    }

    // We can set the score of subject
    public void setScore(double score) {
        this.score = score;
    }

    // Get the name of subject
    public String getName() {
        return name;
    }
}
//Here a class of GradeCalculator
class GradeCalculator {
    public double calculateGrade(Student student) {
        List<Subject> subjects = student.getSubjects();
        double totalScore = 0;
        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }
        // return the grade of each student
        return subjects.isEmpty() ? 0 : totalScore / subjects.size();
    }
}
// Main method
public class SchoolResultsApplication {
    public static void main(String[] args) {
        // Creating different object of student
        Student john = new Student(1, "John");

        // Adding the subject for particular student
        john.addSubject(new Subject(101, "Maths", 90));
        john.addSubject(new Subject(102, "Science", 85));

        GradeCalculator gradeCalculator = new GradeCalculator();
        double averageGrade = gradeCalculator.calculateGrade(john);

        System.out.println("Student: " + john.getName());
        System.out.println("Average Grade: " + averageGrade);
    }
}
