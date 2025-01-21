package Day03_OOPS.Sample_Program;

public class Employee {

    static String companyName="Technocrats";
    String name;
    final int id;
    String designation;
    static int totalEmployee=0;

    //Here we are initialize the data member of a class
    Employee(String name , int id , String designation){

        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployee++;

    }

    // Display total number of employee
    static void displayTotalEmployees(){
        System.out.println("Total number of employee are "+totalEmployee);
    }

    public static void main(String[] args) {
        // Creating the object of a class
        Employee emp1=new Employee("Rahul",130 ,"Student");
        Employee emp2=new Employee("Abhiram", 9 ,"Hoster");

        // Displaying the total number of employee
        Employee.displayTotalEmployees();

    }

}
