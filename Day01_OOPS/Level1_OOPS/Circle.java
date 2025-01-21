import java.util.*;
public class Circle {

	 private double radius;  // Here a radius
	 private double areaCircle;
	 
	 // Constructor
	 public Circle(){
		 
		 // Creating scanner object to read user input
		 Scanner sc=new Scanner(System.in);  
		 
		 System.out.println("Enter the radius of circle: ");
		 this.radius=sc.nextDouble();  // Taking radius as input
		 
		 //here calculating the area of circle
		 this.areaCircle=3.14*radius*radius;
	 } 
	 // Method to display area of circle
	 void displayDetail(){
		 System.out.println("Area of circle is "+areaCircle);
	 }
     public static void main(String args[]){
		 
	     Circle a1=new Circle();  // Creating object of Circle class
		 a1.displayDetail();
	 }
}