package Day02_OOPS.Level1_practice_problem;

public class Hotel {

    // Attributes
    private String guestName;

    private String roomType;

    private int nights;

    // Default constructor
    public Hotel() {
        // Default values
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public Hotel(String guestName, String roomType, int nights) {
        this.guestName = guestName;

        this.roomType = roomType;

        this.nights = nights;
    }

    // Copy constructor
    public Hotel(Hotel otherBooking) {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // Create a booking using default constructor
        Hotel defaultBooking = new Hotel();
        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        // Create a booking using parameterized constructor
        Hotel customBooking = new Hotel("Suresh", "Normal", 3);
        System.out.println("Custom Booking:");
        customBooking.displayBooking();

        // Create a booking using the copy constructor
        Hotel copiedBooking = new Hotel(customBooking);

        System.out.println("Copied Booking:");

        copiedBooking.displayBooking();
    }
}
