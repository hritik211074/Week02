package Day06_OOPS;

// Abstract class representing a vehicle
abstract class Vehicles {
    private String vehicleId;
    private String driverName;
    private double ratePerKm; // Rate per kilometer for fare calculation

    // Constructor to initialize vehicles details
    public Vehicles(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Method to get vehicles details as a formatted string
    public String getVehicleDetails() {
        return "VehicleID: " + vehicleId + ", Driver: " + driverName + ", Rate/Km: " + ratePerKm;
    }

    // Getter for encapsulated field
    protected double getRatePerKm() {
        return ratePerKm;
    }

    // Abstract method to calculate fare based on distance
    public abstract double calculateFare(double distance);
}

// Interface for GPS functionality
interface GPS {
    // Get current location
    String getCurrentLocation();
    // Update location
    void updateLocation(String location);
}

// Car class implementing GPS and extending Vehicles
class Cars extends Vehicles implements GPS {
    private String currentLocation;

    // Constructor to initialize cars details
    public Cars(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

// Bikes class implementing GPS and extending Vehicle
class Bikes extends Vehicles implements GPS {
    private String currentLocation;

    // Constructor to initialize Bikes details
    public Bikes(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

// Auto class implementing GPS and extending Vehicles
class Auto extends Vehicles implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

// Main class for the ride-hailing application
public class RideHailingApp {
    // Process a ride and display vehicle details and fare
    public static void processRide(Vehicles vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails() + ", Fare: " + vehicle.calculateFare(distance));
    }

    public static void main(String[] args) {
        // Create instances of different vehicle types
        Vehicles car = new Cars("CAR123", "Alice", 10);
        Vehicles bike = new Bikes("BIKE456", "Bob", 5);
        Vehicles auto = new Auto("AUTO789", "Charlie", 8);

        // Process rides for each vehicle
        // Cars ride for 15 km
        processRide(car, 15);
        // Bikes ride for 10 km
        processRide(bike, 10);
        // Auto ride for 12 km
        processRide(auto, 12);
    }
}
