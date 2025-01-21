package Day03_OOPS.Sample_Program;

public class Student {
    static String universityName="Technocrats";
    String name;
    char grade;
    final int rollNumber;
    static int totalStudent=0;

    //Here we are initialize the data member of a class
    Student(String name , int rollNumber , char grade){

        this.name=name;
        this.grade=grade;
        this.rollNumber=rollNumber;
        totalStudent++;

    }

    // Display total number of student
    static void displayTotalStudents(){
        System.out.println("Total number of employee are "+totalStudent);
    }

    public static void main(String[] args) {
        // Creating the object of a class
        Student st1=new Student("Rahul",130 ,'A');
        Student st2=new Student("Abhiram", 9 ,'B');

        // Displaying the total number of employee
        Student.displayTotalStudents();

    }
}
