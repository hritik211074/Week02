package Day05_OOPS_Inheritance.Multilevel_Inheritance;


// Base class representing a general Order
class Order {
    // Data member of Order class
    protected String orderId;
    protected String orderDate;

    // Constructor to initialize Order attributes
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return order status
    public String getOrderStatus() {
        return "Order Placed";
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass representing a Shipped Order
class ShippedOrder extends Order {
    // Tracking number for the shipment
    protected String trackingNumber;

    // Constructor to initialize ShippedOrder attributes
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Initialize attributes from the superclass
        this.trackingNumber = trackingNumber;
    }

    // Overriding getOrderStatus to indicate the order is shipped
    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    // Overriding displayOrderDetails to include tracking information
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Display general order details
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass representing a Delivered Order
class DeliveredOrder extends ShippedOrder {
    // Date when the order was delivered
    private String deliveryDate;

    // Constructor to initialize DeliveredOrder attributes
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Initialize attributes from superclass
        this.deliveryDate = deliveryDate;
    }

    // Overriding getOrderStatus to indicate the order is delivered
    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    // Overriding displayOrderDetails to include delivery information
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Display shipped order details
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class to demonstrate multilevel inheritance
public class RetailOrderManagement {
    public static void main(String[] args) {
        // Create a DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD1342345", "2025-1-15", "TRK987654", "2025-01-20");

        // Display the order details and current status
        System.out.println("Order Details:");

        deliveredOrder.displayOrderDetails();
        System.out.println("Current Status: " + deliveredOrder.getOrderStatus());
    }
}
