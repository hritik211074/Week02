import java.util.*;
public class Student  {
	
     private String name;  // Here a name
	 
	 private int rollNumber;   // Here a rollNumber
	 
	 private int marks;  // Here a marks
	 
	 public Student(){
		 
		 // Creating scanner object to read user input
		 Scanner sc=new Scanner(System.in);  
		 
		 System.out.println("Enter the name of student ");
		 this.name=sc.next();  // Taking name as input
		 
		 System.out.println("Enter the roll number of Student  ");
		 this.rollNumber=sc.nextInt();   // Taking rollNumber as input
		 
		 System.out.println("Enter the marks of Student  ");
		 this.marks=sc.nextInt();  // Taking marks as input
	 } 
	 // Method to calculate grades
	  public String gradeCheck(){
		 
		 if(this.marks>=90) return "A";
		 
		 else if(this.marks>=80) return "B";
		 
		 else if(this.marks>=70) return "C";
		 
		 else if(this.marks>=60) return "D";
		 
		 else if(this.marks>=50) return "E";
		 
		 else return "F";
	 }
	 
	 // Method to display result
	 void displayDetail(String grade){
		 System.out.println("Student name is "+name+" and rollNumber is "+rollNumber+" and marks is "+marks+" and grade is "+grade);
	 }
     public static void main(String args[]){
		 
	     Student  st1=new Student ();
		 
		 String grade=st1.gradeCheck();
		 
		 st1.displayDetail(grade);
	 }
	 
}