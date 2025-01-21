import java.util.ArrayList;

public class CartItem { 

    private String itemName;   // Here a item name
	
    private double price;   // Here a price
	
    private int quantity;  // Here a quantity

    public CartItem(String itemName, double price, int quantity) {
	
        this.itemName = itemName;
		
        this.price = price;
		
        this.quantity = quantity;
    }

    // Method to add an item to the cart
    public void addItem(ArrayList<CartItem> cart, CartItem item) {
		
        cart.add(item);
		
        System.out.println(item.itemName + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(ArrayList<CartItem> cart, CartItem item) {
		
        if (cart.remove(item)) {
			
            System.out.println(item.itemName + " removed from the cart.");
			
        } else {
			
            System.out.println(item.itemName + " is not in the cart.");
        }
    }

    // Method to display the total cost of items in the cart
    public static void displayTotalCost(ArrayList<CartItem> cart) {
		
        double totalCost = 0;
		
        for (CartItem item : cart) {
			
            totalCost += item.price * item.quantity;
        }
        System.out.println("Total cost: ₹" + totalCost);
    }

    public static void main(String[] args) {
		
        // Creating an ArrayList to represent the shopping cart
		
        ArrayList<CartItem> cart = new ArrayList<>();

        // Creating some CartItem objects
        CartItem item1 = new CartItem("Apple", 10.0, 2);
		
        CartItem item2 = new CartItem("Banana", 5.0, 5);
        
        // Adding items to the cart
        item1.addItem(cart, item1);
        item2.addItem(cart, item2);
        
        // Displaying the total cost of items in the cart
        CartItem.displayTotalCost(cart);

        // Removing an item from the cart
        item1.removeItem(cart, item1);
        
        // Displaying the total cost of items in the cart after removal
        CartItem.displayTotalCost(cart);
    }
}