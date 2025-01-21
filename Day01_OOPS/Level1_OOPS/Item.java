import java.util.*;
public class Item  {
     private int  itemCode;  // Here a itemcode
	 
	 private String itemName;   // Here a itemName
	 
	 private int price;  // Here a price
	 
	 public Item(){
		 
		 // Creating scanner object to read user input
		 Scanner sc=new Scanner(System.in);  
		 
		 System.out.println("Enter the item code  ");
		 this.itemCode=sc.nextInt();  // Taking itemCode as input
		 
		 System.out.println("Enter the itemName of Item ");
		 this.itemName=sc.next();   // Taking itemName as input
		 
		 System.out.println("Enter the price of Item ");
		 this.price=sc.nextInt();  // Taking price as input
	 } 
	 // Method to display result
	 void displayItemDetail(){
		 System.out.println("Item's code is "+itemCode+" and item name is "+itemName+" and price is "+price);
	 }
     public static void main(String args[]){
		 
		 // Creating the object of item class
	     Item  b1=new Item ();
		 b1.displayItemDetail();
	 }
}