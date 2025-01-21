package Day03_OOPS.Sample_Program;

public class Book  {

    static String libraryName;  // Here we have library name

    String title;  // title of book
    String author;  // It's author of book
    final boolean isbn;  // It's unique identifier of book
    Book (String title ,String author ,boolean isbn){
        this.title=title;

        this.author=author;

        this.isbn=isbn;
    }
    public static void displayLibraryName(){

        System.out.println("The name of library is "+libraryName);

    }

    public static void main(String[] args) {

        System.out.println("Enter the name of library ");
        Book .libraryName="Jan library";
        // Creating the object of  class
        Book  lb1=new Book ("Kamayani","Jay shankar prasad",true);

        // Displaying the detail of library
        Book .displayLibraryName();

        // Checking object is instance of current class or not
        if(lb1 instanceof Book ){
            System.out.println("This is a instance of LibraryManagementSystem");
        }else{
            System.out.println("This is not a instance of LibraryManagementSystem");
        }
    }
}
