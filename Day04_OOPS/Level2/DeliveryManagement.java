package Day04_OOPS.Level2;

import java.util.ArrayList;
import java.util.List;

// Represents a product in the e-commerce platform
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// Represents an order that contains multiple products
class Order {
    int orderId;
    List<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void viewOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            System.out.println("Product: " + product.name + ", Price: " + product.price);
        }
    }
}

// Represents a customer who can place orders
class Customers {
    String name;
    List<Order> orders = new ArrayList<>();

    Customers(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        orders.add(order);
    }

    void viewOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.viewOrder();
        }
    }
}

// Main class to demonstrate the relationships and interactions
public class DeliveryManagement {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Headphones", 150.00);

        // Create orders and add products to them
        Order order1 = new Order(101);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(102);
        order2.addProduct(product3);

        // Create a customer and place orders
        Customers customer = new Customers("John Doe");
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // View customer's orders
        customer.viewOrders();
    }
}

