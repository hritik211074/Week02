package Day05_OOPS_Inheritance.Assisted_Problem;

import java.awt.image.CropImageFilter;

// Here a super clss vehciel
class Vehicle{
    String fuelType;
    int maxSpeed;
    Vehicle(String fuelType,int maxSpeed){
        this.fuelType=fuelType;
        this.maxSpeed=maxSpeed;
    }
    // Displaying the details of vehicle
    void displayInfo(){
        System.out.println("Vehicle fuel type is "+this.fuelType);
        System.out.println("Vehicle max Speed is "+this.maxSpeed);
    }
}

//  Car class extending the vehicle class
class Car extends Vehicle{
    // Here some other data member of Car class
    int seatCapacity;

    // Constructor of Car class
    Car(String fuelType,int maxSpeed,int seatCapacity){
        super(fuelType,maxSpeed);
        this.seatCapacity=seatCapacity;
    }
    // Displaying the details of Car
    @Override
    void displayInfo(){
        System.out.println("Car details is ");
        super.displayInfo();
        System.out.println("Vehicle seat capacity is"+seatCapacity);

    }
}

// Truck class extending the vehicle class
class Truck extends Vehicle{
    int loadCapacity;
    Truck(String fuelType,int maxSpeed,int loadCapacity){
        super(fuelType,maxSpeed);
        this.loadCapacity=loadCapacity;
    }
    // Displaying the details of truck
    @Override
    void displayInfo(){
        System.out.println("Truck details is : ");
        super.displayInfo();
        System.out.println("Vehicle load capacity is"+loadCapacity);

    }

}
// Motorcycle class extending vehicle class
class MotorCycle extends Vehicle{
    int mileage;
    MotorCycle(String fuelType,int maxSpeed,int mileage){
        super(fuelType,maxSpeed);
        this.mileage=mileage;
    }
    // Displaying the details of Car
    @Override
    void displayInfo(){
        System.out.println("Motor Cycle details is");
        super.displayInfo();
        System.out.println("Vehicle mileage is "+mileage);
    }
}
public class Transport_System {
    public static void main(String[] args) {
        // Creating the instance of Truck
        Vehicle truck = new Truck("Diesel",50,200000);

        Vehicle car=new Car("Petrol",90,5);

        Vehicle motor=new MotorCycle("Petrol",80,70);

        // Creating the array to store all vehicle
        Vehicle []vehicles = {truck,car,motor};
        for(Vehicle vh:vehicles ){
            vh.displayInfo();
        }
    }
}
