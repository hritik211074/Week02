package Day05_OOPS_Inheritance.Single_Inheritance;

class Book{
    String title;
    int publicationYear;
    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }

    // Display method to print the details in super class
    void displayInfo(){
        System.out.println("Book title is "+this.title);
        System.out.println("Book publication year is: "+this.publicationYear);
    }
}
// A author class extending the  book class
class Author extends Book{

    // Data member of Author class
    String name;
    String bio;

    // Constructor of Author to initialize the data member of author
    Author(String name,int publicationYear,String title,String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    // Overriding the display method and print the details of author
    @Override
    void displayInfo(){
        System.out.println("Details of author is: ");

        System.out.println("name is "+this.name);

        super.displayInfo();

        System.out.println("Bio is "+this.bio);
    }
}
// Main method
public class Library_Management {
    public static void main(String[] args) {
        // Creating the instance of aauthor class
        Author a1=new Author("charlie",2003,"Power of habbit","My name");
        a1.displayInfo();

        Author a2=new Author("Ramdas",2016,"Janki","Favorite");
        a2.displayInfo();
    }

}
