package Day05_OOPS_Inheritance.Hybrid_Inheritance;

// Superclass representing a vehicle
class Vehicle {
    // Data members of Vehicle class
    String model;
    int maxSpeed;

    // Contructor to initialize the model and maxSpeed
    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Displaying the information
    void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface for refuelable vehicles
interface Refuelable {
    void refuel();
}

// Electric vehicle subclass
class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    // Constructor to initialize the data member of Electric Vehicle
    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        // Call super class constructor
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge
    void charge() {
        // Displaying the information
        displayInfo();

        System.out.println("Battery: " + batteryCapacity + " kWh. Charging...");
    }
}

// Petrol vehicle subclass
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelCapacity;

    // constructor to  initialization todata member of Petrol Vehicle
    PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        // Call super class constructor to initialize the inherit data member of Petrol vehicle
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    public void refuel() {
        // Display the information
        displayInfo();
        System.out.println("Fuel: " + fuelCapacity + " liters. Refueling...");
    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {

        new ElectricVehicle("Tesla Model 3", 200, 75).charge();
        System.out.println();
        new PetrolVehicle("Toyota Corolla", 180, 50).refuel();
    }
}

