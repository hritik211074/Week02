package Day05_OOPS_Inheritance.Assisted_Problem;

import java.awt.event.ItemEvent;
// Here a Employee class
class Employee{
    // Data members of Employee
    String name;
    int id;
    int salary;
    // Constructor to initialize the data members of employee
    Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    // Display method
    void displayDetails(){

        System.out.println("Name is "+name);
        System.out.println("Id is "+id);

        System.out.println("Salary is "+salary);
    }
}
// Inheritance where manager inherit Manager
class Manager extends Employee{
    int teamSize;
    Manager(String name,int id,int salary,int teamSize){
        super(name,id,salary);
        this.teamSize= teamSize;
    }
    void displayDetails(){
        System.out.println("The details of manager is: ");
        super.displayDetails();
        System.out.println("Team size is "+ this.teamSize);
    }
}
// Inheritance where developer inherit Manager
class Developer extends Employee{

    String programmingLanguage;
    Developer(String name,int id,int salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage= programmingLanguage;
    }

    void displayDetails(){
        System.out.println("The details of developer is: ");
        super.displayDetails();
        System.out.println("Developer programming language  is "+ this.programmingLanguage);
    }
}
// Inheritance where Intern inherit Manager
class Intern extends Employee{
    Intern(String name,int id,int salary){
        super(name,id,salary);
    }

    void displayDetails(){
        System.out.println("The details of Inter is: ");
        System.out.println("The details of Intern is: ");
        super.displayDetails();
    }
}
//Main method
public class Management_System {

    public static void main(String[] args) {

        // Creating the object of manager
        Manager m1=new Manager("Hritik",101,1000,10);
        m1.displayDetails();

        // Creating the object of developer
        Developer d1=new Developer("Vinay",102,100,"Java");
        d1.displayDetails();
        // Creating the object of Intern class
        Intern in1=new Intern("suresh",103,50);
    }
}
