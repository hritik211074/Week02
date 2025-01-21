public class MovieTicket {

    private String movieName;
    private int seatNumber;
    private double price;

    public void bookTicket(String newMovieName, int newSeatNumber, double newPrice) {
	
        this.movieName = newMovieName;
		
        this.seatNumber = newSeatNumber;
		
        this.price = newPrice;
		
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
	
        System.out.println("Movie Name: " + this.movieName);
		
        System.out.println("Seat Number: " + this.seatNumber);
		
        System.out.println("Price: ₹" + this.price);
    }

    public static void main(String[] args) {
	
        // Create a new MovieTicket object
        MovieTicket ticket = new MovieTicket();

        // Book a new ticket
        ticket.bookTicket("Inception ", 42, 350.0);

        // Display the ticket details
        System.out.println("Displaying ticket details: ");
        ticket.displayTicketDetails();
    }
}