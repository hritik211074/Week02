package Day06_OOPS;

import java.util.*;

// Abstract class Product
abstract class Product {

    private int productId; private String name; private double price;

    // Constructor to initialize productID, name, price
    public Product(int id, String name, double price) {
        this.productId = id; this.name = name; this.price = price;
    }
    // Abstract discount logic
    public abstract double calculateDiscount();

    // Method to calculate final price
    public double finalPrice() {
        return price + (this instanceof Taxable ? ((Taxable) this).calculateTax() : 0) - calculateDiscount();
    }

    public String getDetails() {
        return "ID: " + productId + ", Name: " + name + ", Final Price: $" + finalPrice();
    }

    public double getPrice() { return price; } // Getter for price
}

// Interface for Taxable products
interface Taxable {
    double calculateTax();
}

// Electronics -> Discount 10%, Tax 18%
class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) { super(id, name, price); }

    public double calculateDiscount() { return 0.1 * getPrice(); } // Use price directly
    public double calculateTax() { return 0.18 * getPrice(); }    // Use price directly
}

// Clothing -> Discount 20%, Tax 5%
class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return 0.2 * getPrice(); } // Use price directly
    public double calculateTax() { return 0.05 * getPrice(); }    // Use price directly
}

// Groceries -> Discount 5%, No Tax
class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return 0.05 * getPrice(); } // Use price directly
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        // List of products (Polymorphism)
        List<Product> products = Arrays.asList(
                new Electronics(1, "Laptop", 1000),
                new Clothing(2, "Jacket", 200),
                new Groceries(3, "Rice", 50)
        );

        // Displaying details of each product
        products.forEach(p -> System.out.println(p.getDetails()));
    }
}
