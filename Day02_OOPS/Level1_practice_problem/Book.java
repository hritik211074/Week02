package Day02_OOPS.Level1_practice_problem;

// Book class definition
    class BookContent {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public BookContent() {
        // Initialize attributes with default values
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public BookContent(String title, String author, double price) {
        // Initialize attributes with provided values
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

// Example usage
public class Book {
    public static void main(String[] args) {
        // Creating a book with default constructor
        BookContent defaultBook = new BookContent();
        // Creating a book with parameterized constructor
        BookContent parameterizedBook = new BookContent("Kamayani", "Jayshankar prasad", 150);

    }
}
