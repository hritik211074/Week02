package Day02_OOPS.Level1_practice_problem;


public class CarRental {
    // Attributes
    private String customerName;

    private String carModel;

    private int rentalDays;

    private static final double DAILY_RATE = 50.0;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Unknown";
        this.rentalDays = 0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {

        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Copy constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }


}

// Example usage
    class CarRent {
    public static void main(String[] args) {
        // Creating a rental with default constructor
        CarRental rent = new CarRental();
        System.out.println("Default Rental: " + rent);

        // Creating a rental with parameterized constructor
        CarRental parameterizedRental = new CarRental("Ramesh", "volvo", 10);
        System.out.println("Parameterized Rental: " + parameterizedRental);

        // Creating a copy of the rental using the copy constructor
        CarRental copiedRent = new CarRental(parameterizedRental);

        System.out.println("Copied Rental: " + copiedRent);
    }
}

