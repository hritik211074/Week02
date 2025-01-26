package Day06_OOPS;


import java.util.*;

// Abstract class representing a library item
abstract class LibraryItem {
    // Data member of Library Item
    private String itemId, title, author;

    // Constructor to initialize the data memeber of Library Item
    public LibraryItem(String itemId, String title, String author) { this.itemId = itemId; this.title = title; this.author = author; }

    // Abstract method to get loan duration
    public abstract int getLoanDuration();
    // Item details
    public String getItemDetails() { return "ID: " + itemId + ", Title: " + title + ", Author: " + author; }
}

// Interface for reservable items
interface Reservable {
    // Check if the item is available
    boolean checkAvailability();
}

// Book class with a 14-day loan duration
class Book extends LibraryItem implements Reservable {

    public Book(String itemId, String title, String author) { super(itemId, title, author); }

    // Book loan duration: 14 days
    public int getLoanDuration() { return 14; }
    public void reserveItem() { System.out.println("Book reserved: " + getItemDetails()); }
    // Assuming book is available
    public boolean checkAvailability() { return true; }
}

// Magazine class with a 7-day loan duration
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) { super(itemId, title, author); }

    // Magazine loan duration: 7 days
    public int getLoanDuration() { return 7; }
    public void reserveItem() { System.out.println("Magazine reserved: " + getItemDetails()); }
    // Assuming magazine is available
    public boolean checkAvailability() { return true; }
}

// DVD class with a 3-day loan duration
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) { super(itemId, title, author); }

    // DVD loan duration: 3 days
    public int getLoanDuration() { return 3; }
    public void reserveItem() { System.out.println("DVD reserved: " + getItemDetails()); }

    // Assuming DVD is available
    public boolean checkAvailability() { return true; }
}

// Main class to demonstrate polymorphism
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = Arrays.asList(
                new Book("B001", "Raj Rani", "suresh"),
                new Magazine("M001", "Gantavya", "ramesh"),
                new DVD("D001", "runika", "mahesh")
        );

        // Process library items with polymorphism
        items.forEach(item -> {
            System.out.println(item.getItemDetails() + ", Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Available: " + reservable.checkAvailability());
            }
            System.out.println();
        });
    }
}

