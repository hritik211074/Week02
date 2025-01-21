import java.util.*;
public class Employee {
     private String name;  // Here a name
         private int id;   // Here a id
	 private int salary;  // Here a salary
	 
	 public Employee(){
		 
		 // Creating scanner object to read user input
		 Scanner sc=new Scanner(System.in);  
		 
		 System.out.println("Enter the name of employee ");
		 this.name=sc.next();  // Taking name as input
		 
		 System.out.println("Enter the id of employee ");
		 this.id=sc.nextInt();   // Taking id as input
		 
		 System.out.println("Enter the salary of employee ");
		 this.salary=sc.nextInt();  // Taking salary as input
	 } 
	 // Method to display result
	 void displayDetail(){
		 System.out.println("Employee name is "+name+" and id is "+id+" and salary is "+salary);
	 }
     public static void main(String args[]){
	     Employee emp=new Employee();
		 emp.displayDetail();
	 }
}