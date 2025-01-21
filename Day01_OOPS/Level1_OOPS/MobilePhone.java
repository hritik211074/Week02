import java.util.*;
public class MobilePhone   {
     private String  brand;  // Here a brand
	 
	 private String model;   // Here a model
	 
	 private int price;  // Here a price
	 
	 public MobilePhone(){
		 
		 // Creating scanner object to read user input
		 Scanner sc=new Scanner(System.in);  
		 
		 System.out.println("Enter the brand of MobilePhone  ");
		 this.brand=sc.nextLine();  // Taking brand as input
		 
		 System.out.println("Enter the model of MobilePhone ");
		 this.model=sc.nextLine();   // Taking model as input
		 
		 System.out.println("Enter the price of MobilePhone ");
		 this.price=sc.nextInt();  // Taking price as input
		 
	 } 
	 // Method to display result
	 void displayMobileDetail(){
		 System.out.println("Brand is "+brand+" and model name is "+model+" and price is "+price);
	 }
     public static void main(String args[]){
		 
		 // Creating the object of item class
	     MobilePhone  m1=new MobilePhone ();
		 m1.displayMobileDetail();
	 }
}