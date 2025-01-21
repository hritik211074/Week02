package Day02_OOPS.Level1_practice_problem;

public class BookBorrow {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;


    // Default Constructor
    public BookBorrow() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.isAvailable = true;
    }


    // Parameterized Constructor
    public BookBorrow(String bookTitle, String bookAuthor, double bookPrice, boolean isAvailable) {
        this.title = bookTitle;
        this.author = bookAuthor;
        this.price = bookPrice;
        this.isAvailable = isAvailable;
    }


    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book: " + title);
            return true;
        } else {
            System.out.println("Sorry, the book: " + title + " is currently unavailable.");
            return false;
        }
    }


    // Method to display the book details
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Unavailable"));
    }


    public static void main(String[] args) {
        // Creating book instances
        BookBorrow book1 = new BookBorrow("Rashmirathi", "Ramdhari Singh Dinkar", 450, true);

        BookBorrow book2 = new BookBorrow("Munsi Premchand", "Karam Bhumi", 250, false);

        // Displaying book details
        System.out.println("Book 1 Info:");
        book1.displayBookInfo();

        System.out.println("\nBook 2 Info:");
        book2.displayBookInfo();

        // Borrowing books
        System.out.println("\nAttempting to borrow Book 1:");
        book1.borrowBook();

        System.out.println("\nAttempting to borrow Book 2:");
        book2.borrowBook();
    }
}
