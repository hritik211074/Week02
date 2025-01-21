package Day03_OOPS.Sample_Program;
import java.util.*;
public class Product  {

    // Data members of class
    static int discount;

    String productName;

    final int productId;

    int price;

    int quantity;
    // Constructor to initialize the data member like price quantity , productName
    Product (String productName,int price,int quantity ){
        this(101);

        this.productName=productName;

        this.price=price;

        this.quantity=quantity;
    }
    // Constructor to initialize productId
    Product (int productId){
        this.productId=productId;
    }
    static void updateDiscount(int newDiscount){
        discount=newDiscount;
        System.out.println("New updated discount is "+discount);
    }

    public static void main(String[] args) {
        // Creating the  scanner object to read user input
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the discount we want to offer ");
        Product .discount=sc.nextInt();   // Initialize the Discount
        // Creating the object of EmployeeManagementSystem
        Product  employee=new Product ("IDE",2300,12);

        System.out.println("Enter the new Discount ");
        int newDiscount=sc.nextInt();   // Take a user input

        employee.updateDiscount(newDiscount);

        if(employee instanceof Product ){
            System.out.println("This is a instance of EmployeeManagementSystem");
        }else{
            System.out.println("This is not a instance of EmployeeManagementSystem");
        }
    }
}
