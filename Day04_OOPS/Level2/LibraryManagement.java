package Day04_OOPS.Level2;

import java.util.ArrayList;

// Define the Book class
class Book {
    private String title;
    private String author;

    // Constructor to initialize the data members of Book class
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters to get title
    public String getTitle() {
        return title;
    }
    // Get the author of book
    public String getAuthor() {
        return author;
    }
}

// Define the Library class
class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to get the list of books
    public ArrayList<Book> getBooks() {
        return books;
    }
}

// Demonstrating the aggregation relationship
public class LibraryManagement {
    public static void main(String[] args) {
        // Create books
        Book b1 = new Book("Book Title 1", "Author 1");
        Book b2 = new Book("Book Title 2", "Author 2");

        // Create libraries
        Library library1 = new Library();
        Library library2 = new Library();

        // Add books to libraries
        library1.addBook(b1);
        library1.addBook(b2);
        library2.addBook(b1);

        // Display books in library1
        System.out.println("Books in Library 1:");
        for (Book book : library1.getBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        // Display books in library2
        System.out.println("Books in Library 2:");
        for (Book book : library2.getBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
