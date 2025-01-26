package Day06_OOPS;

// Abstract class representing a food item
abstract class FoodItem {
    private String itemName; private double price; private int quantity; // Item details

    // Constructor to initialize item details
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName; this.price = price; this.quantity = quantity;
    }

    // Method to get item details in string format
    public String getItemDetails() {
        return itemName + " (Price: " + price + ", Qty: " + quantity + ")";
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Getter methods for encapsulated fields
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}

// Interface for discount functionality
interface Discountable {
    double applyDiscount(double amount); // Method to apply a discount on total amount
}

// Class for vegetarian food items
class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Calculate total price for veg items
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

// Class for non-vegetarian food items
class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Calculate total price for non-veg items with extra charges
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 20;
    }
}

// Main class to process orders
public class FoodDeliverySystem {
    // Method to process an order with a discount
    public static void processOrder(FoodItem item, Discountable discount) {
        // Apply discount
        double total = discount.applyDiscount(item.calculateTotalPrice());

        // Print details
        System.out.println(item.getItemDetails() + ", Total: " + total);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create veg item
        FoodItem veg = new VegItem("Paneer", 150, 2);

        // Create non-veg item
        FoodItem nonVeg = new NonVegItem("Chicken", 200, 1);

        // Define 10% discount
        Discountable discount = (amount) -> amount * 0.9;

        // Process veg order
        processOrder(veg, discount);

        // Process non-veg order
        processOrder(nonVeg, discount);
    }
}

