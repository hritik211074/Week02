package Day02_OOPS.Level1_practice_problem;

// Vehicle class definition
public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (fixed for all vehicles)
    private static double registrationFee = 100.0; // Assuming a fixed registration fee of $100

    // Default constructor
    public Vehicle() {
        this.ownerName = "Unknown";
        this.vehicleType = "Unknown";
    }

    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

// Example usage
class Transport {
    public static void main(String[] args) {
        // Creating a vehicle using the parameterized constructor
        Vehicle vehicle = new Vehicle("Rahul", "deshmukh");

        // Displaying vehicle details
        vehicle.displayVehicleDetails();

        // Updating the registration fee
        Vehicle.updateRegistrationFee(150.0);

    }
}
