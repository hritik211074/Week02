package Day04_OOPS.Level2;

import java.util.ArrayList;
import java.util.List;

// Represents a faculty member who can exist independently of any department
class Faculty {
    String name;

    // Constructor to initialize the name of faculty
    Faculty(String name) {
        this.name = name;
    }
}

// Represents a department that can contain multiple faculty members
class Departments {
    String name;
    List<Faculty> faculties = new ArrayList<>();

    Departments(String name) {
        this.name = name;
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
}

// Represents a university that contains multiple departments
class University {
    String name;
    List<Departments> departments = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Departments department) {
        departments.add(department);
    }

    // Method to simulate the deletion of the university and its departments
    void deleteUniversity() {
        System.out.println("University " + name + " is being deleted.");
        departments.clear();
    }
}

public class DepartmentManagement {
    public static void main(String[] args) {
        // Create faculty members
        Faculty faculty1 = new Faculty("LK sir");
        Faculty faculty2 = new Faculty("Jain sir");
        Faculty faculty3 = new Faculty("karam sir");

        // Create departments and add faculty members to them
        Departments department1 = new Departments("Computer Science");
        department1.addFaculty(faculty1);
        department1.addFaculty(faculty2);

        Departments department2 = new Departments("Mathematics");
        department2.addFaculty(faculty3);

        // Create a university and add departments to it
        University university = new University("Tech University");
        university.addDepartment(department1);
        university.addDepartment(department2);

        // Demonstrate that deleting the university deletes all departments
        university.deleteUniversity();

        // Show that faculty members can exist independently of departments
        System.out.println("Faculty members:");

        System.out.println(faculty1.name);

        System.out.println(faculty2.name);

        System.out.println(faculty3.name);
    }
}

