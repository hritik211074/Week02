package Day02_OOPS.Level1_practice_problem;

public class LibraryBook {

    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title is : " + title);
        System.out.println("Author is : " + author);
        System.out.println("Price is : $" + price);
        System.out.println("Available is: " + (isAvailable ? "Yes" : "No"));
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("You have successfully borrowed \"" + title + "\" by " + author);
            isAvailable = false; // Update availability status to false
        } else {
            System.out.println("Sorry, \"" + title + "\" by " + author + " is currently not available.");
        }
    }

    public static void main(String[] args) {
        // Create a book
        LibraryBook book1 = new LibraryBook("Kamayani", "Ramdhari singh Dinakar", 900, true);

        // Display book details
        book1.displayDetails();

        // Borrow the book
        System.out.println("Attempting to borrow the book...");
        book1.borrowBook();

        // Display book details again to see the change in availability
        System.out.println("Book details after borrowing:");
        book1.displayDetails();
    }
}