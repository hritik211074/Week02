package Day03_OOPS.Sample_Program;
import java.util.*;
public class Vehicle{

    static int registrationFee ;  // Here we have registrationFee

    String ownerName;  // Owner of a vehicle
    String vehicleType;  // It's vehicle type
    final int registrationNumber ;  // It's registration

    Vehicle (String ownerName ,String vehicleType ,int registrationNumber){
        this.ownerName=ownerName;

        this.vehicleType=vehicleType;

        this.registrationNumber=registrationNumber;
    }

    // Method to update the registration fee
    public static void updateRegistrationFee(int newRegistrationFee){

        registrationFee=newRegistrationFee;
    }

    public void displayDetails(){
        if(this instanceof Vehicle){
            System.out.println("This is a instance of current vehicle class");
            System.out.println("Owner name is "+ownerName);
            System.out.println("Vehicle type of vehicle is "+vehicleType);
            System.out.println("Registration number of vehicle is "+registrationNumber);
        }else{
            System.out.println("This is not a instance of current class");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the registration fee ");
        registrationFee=sc.nextInt();

        // Creating the object of  class
        Vehicle  vl1=new Vehicle ("Ramesh","FourWheeler",23133);
        Vehicle  vl2=new Vehicle ("Suresh","TwoWheeler",232323);

        // Displaying the detail of vehicle
        System.out.println("Enter the new registration fee");
        int newRegistrationFee=sc.nextInt();
        vl1.displayDetails();
        vl2.displayDetails();

        Vehicle .updateRegistrationFee(newRegistrationFee);
    }
}

