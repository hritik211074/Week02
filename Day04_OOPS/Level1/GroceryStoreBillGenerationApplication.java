package Day04_OOPS.Level1;

import java.util.ArrayList;
import java.util.List;

// Here a Customer class
class Customer {
    private int customerId;
    private String name;
    private List<Product> products;

    // Constructor to initialize the data member of Customer class
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.products = new ArrayList<>();
    }
    // Add the product of customer
    public void addProduct(Product product) {
        products.add(product);
    }

    // Removing the product
    public void removeProduct(Product product) {
        products.remove(product);
    }
    // Returning the list of product
    public List<Product> getProducts() {
        return products;
    }
    // Returning the name of customer
    public String getName() {
        return name;
    }

}
// Here the product class
class Product {
    private int productId;
    private String name;
    private double price;

    // constructor of product to initialize the data member of Product class
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Returning the price of product
    public double getPrice() {
        return price;
    }
    // Here we are setting the price of product
    public void setPrice(double price) {
        this.price = price;
    }
    // Returning the name of product
    public String getName() {
        return name;
    }
}

class BillGenerator {
    public double computeTotal(Customer customer) {
        List<Product> products = customer.getProducts();
        double total = 0;
        /// Calculating the price of all product of specific student
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
// This is a main class
public class GroceryStoreBillGenerationApplication {

    public static void main(String[] args) {
        // We are making the instance of Customer class
        Customer alice = new Customer(1, "Alice");
        alice.addProduct(new Product(201, "Apples", 6.0)); // 2 kg at $3 per kg
        alice.addProduct(new Product(202, "Milk", 2.0));   // 1 liter at $2 per liter


        BillGenerator billGenerator = new BillGenerator();
        double totalBill = billGenerator.computeTotal(alice);

        System.out.println("Customer: " + alice.getName());
        System.out.println("Total Bill: $" + totalBill);
    }
}

