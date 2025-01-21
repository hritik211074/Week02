package Day02_OOPS.Level1_practice_problem;

// Product class definition
public class Product {
    // these are the instance variables
    private String productName;
    private double price;

    // static variable that will share among every object
    private static int totalProducts = 0;

    // Default constructor
    public Product() {
        this.productName = "Unknown";
        this.price = 0.0;
        totalProducts++; // Increment total products count
    }

    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products count
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

// Example usage
    class Collection {
    public static void main(String[] args) {
        // Creating products using the parameterized constructor
        Product product1 = new Product("Laptop", 999.99);

        Product product2 = new Product("Smartphone", 499.99);

        // Displaying product details
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Displaying total number of products created
        Product.displayTotalProducts();
    }
}

