package Day06_OOPS;

import java.util.*;

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber, type;
    private double rentalRate;

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber; this.type = type; this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days); // Abstract method for rental cost

    public String getDetails() {
        return "Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rental Rate: $" + rentalRate;
    }

    public double getRentalRate() { return rentalRate; } // Encapsulation via getter
}

// Interface for Insurable vehicles
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car -> Insurance 10% of rental rate, Rental cost: days * rate
class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) { return days * getRentalRate(); }
    public double calculateInsurance() { return 0.1 * getRentalRate(); }
    public String getInsuranceDetails() { return "Car Insurance Policy: " + policyNumber; }
}

// Bike -> Insurance 5% of rental rate, Rental cost: days * rate
class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    // Calling method to calculate rent insurance and insurance details of car
    public double calculateRentalCost(int days) { return days * getRentalRate(); }
    public double calculateInsurance() { return 0.05 * getRentalRate(); }
    public String getInsuranceDetails() { return "Bike Insurance Policy: " + policyNumber; }
}

// Truck -> Insurance 15% of rental rate, Rental cost: days * rate
class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    // Constructor initialialize the data memebr of truck
    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    // Calling method to calculate rent insurance and insurance details of truck
    public double calculateRentalCost(int days) { return days * getRentalRate(); }
    public double calculateInsurance() { return 0.15 * getRentalRate(); }
    public String getInsuranceDetails() { return "Truck Insurance Policy: " + policyNumber; }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // List of vehicles
        List<Vehicle> vehicles = Arrays.asList(
                new Car("C123", 50, "CAR101"),
                new Bike("B456", 20, "BIKE202"),
                new Truck("T789", 100, "TRUCK303")
        );

        // Calculate rental and insurance costs for each vehicle
        int rentalDays = 5;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getDetails());
            System.out.println("Rental Cost for " + rentalDays + " days: $" + vehicle.calculateRentalCost(rentalDays));
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: $" + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}

