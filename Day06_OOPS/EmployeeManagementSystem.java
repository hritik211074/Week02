package Day06_OOPS;

import java.util.*;

// Abstract class Employee
abstract class Employee {
    // Data member of Employee class
    private int id;
    private String name;
    private double baseSalary;

    // Constructor to initialize the id , name , baseSalary
    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // method to calculate salary
    public abstract double calculateSalary(); // Abstract method for salary

    // Display the details
    public void displayDetails() { // Common details for all employees
        System.out.println("ID: " + id + ", Name: " + name +
                ", Base Salary: $" + baseSalary +
                ", Total Salary: $" + calculateSalary());
    }

    // Getter for base salary
    public double getBaseSalary() { return baseSalary; }
}

// Interface for department operations
interface Department {

    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

// Full-time employee with fixed salary
class FullTimeEmployee extends Employee implements Department {

    private double fixedSalary;
    private String department;

    // Constructor to initialize the data member of Full timw employee
    public FullTimeEmployee(int id, String name, double base, double fixedSalary) {
        super(id, name, base);

        this.fixedSalary = fixedSalary;
    }

    // Calculating the salary
    public double calculateSalary() {
        return getBaseSalary() + fixedSalary; // Direct calculation
    }

    // Here assigning a department
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Part-time employee with hourly wages
class PartTimeEmployee extends Employee implements Department {
    private int hours;
    private double rate;
    private String department;

    // Constructor to initialize the data member of Part time employee
    public PartTimeEmployee(int id, String name, double base, int hours, double rate) {
        super(id, name, base);
        this.hours = hours;
        this.rate = rate;
    }

    // Calculating the salary of part time employee
    public double calculateSalary() {
        return getBaseSalary() + (hours * rate); // Direct calculation
    }

    //Assigning the department to part time employee
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    // Here a details of department
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(); // Polymorphism with a list
        FullTimeEmployee fte = new FullTimeEmployee(1, "Alice", 2000, 3000);
        PartTimeEmployee pte = new PartTimeEmployee(2, "Bob", 1000, 20, 50);

        fte.assignDepartment("Finance");
        pte.assignDepartment("Operations");
        employees.add(fte);
        employees.add(pte);

        for (Employee emp : employees) { // Process and display employee details
            emp.displayDetails();
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
        }
    }
}
