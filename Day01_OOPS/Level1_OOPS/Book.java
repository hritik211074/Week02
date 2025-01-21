import java.util.*;
public class Book  {
     private String title;  // Here a title
	 
	 private String author;   // Here a author
	 
	 private int price;  // Here a price
	 
	 public Book(){
		 
		 // Creating scanner object to read user input
		 Scanner sc=new Scanner(System.in);  
		 
		 System.out.println("Enter the title of book ");
		 this.title=sc.next();  // Taking title as input
		 
		 System.out.println("Enter the author of book ");
		 this.author=sc.next();   // Taking author as input
		 
		 System.out.println("Enter the price of book ");
		 this.price=sc.nextInt();  // Taking price as input
	 } 
	 // Method to display result
	 void displayBookDetail(){
		 System.out.println("Book title is "+title+" and author is "+author+" and price is "+price);
	 }
     public static void main(String args[]){
	     Book  b1=new Book ();
		 b1.displayBookDetail();
	 }
}