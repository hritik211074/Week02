package Day02_OOPS.Level1_practice_problem;

class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify the salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }


    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }


    public static void main(String[] args) {
        // Creating an Employee instance
        Employee employee = new Employee(101, "HR", 50000.0);


        // Displaying employee details
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();


        // Modifying the salary
        System.out.println("Update Salary is :");
        employee.setSalary(55000.0);
        employee.displayEmployeeDetails();


        // Creating a Manager instance
        Manager manager = new Manager(102, "IT", 80000.0, 5);


        // Displaying manager details
        System.out.println("Manager Details:");
        manager.displayEmployeeDetails();
    }
}
class Manager extends Employee {
    private int teamSize;


    // Constructor to initialize manager details
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }


    // Overriding displayEmployeeDetails to include team size
    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
