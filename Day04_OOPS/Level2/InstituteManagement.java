package Day04_OOPS.Level2;

import java.util.ArrayList;

// Employee class
class Employee {
    private String name;

    // Constructor to initialize the Employee's name
    public Employee(String name) {
        this.name = name;
    }

    // Getter method to return the Employee's name
    public String getName() {
        return name;
    }
}

// Department class
class Department {
    private String name;
    private ArrayList<Employee> employees;

    // Constructor to initialize the Department's name and list of Employees
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Method to add an Employee to the Department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    //Method to  return the name of Department
    public String getDepartName(){
        return name;
    }

    // Method to display all Employees in the Department
    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getName());
        }
    }
}

// Company class
class Company {
    private String name;
    private ArrayList<Department> departments;

    // Constructor to initialize the Company's name and list of Departments
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add a Department to the Company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display all Departments and their Employees in the Company
    public void displayDepartments() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            System.out.println("Department: " + department.getDepartName());
            department.displayEmployees();
        }
    }
}

// Main class to demonstrate the composition relationship
public class InstituteManagement {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("TechCorp");

        // Create departments
        Department dept1 = new Department("Engineering");
        Department dept2 = new Department("HR");

        // Create employees
        Employee emp1 = new Employee("Suresh");
        Employee emp2 = new Employee("Dinesh");
        Employee emp3 = new Employee("Mohit");

        // Add employees to departments
        dept1.addEmployee(emp1);
        dept1.addEmployee(emp2);
        dept2.addEmployee(emp3);

        // Add departments to the company
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Display all departments and employees in the company
        company.displayDepartments();
    }
}

