package Day06_OOPS;

// Abstract class representing a patient
abstract class Patient {
    private int patientId; private String name; private int age; // Patient details

    // Constructor to initialize patient details
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId; this.name = name; this.age = age;
    }

    // Method to get patient details
    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Abstract method to calculate the bill
    public abstract double calculateBill();
}

// Interface for managing medical records
interface MedicalRecord {
    // Add a medical record
    void addRecord(String record);
    // View all medical records
    String viewRecords();
}

// Class for in-patients
class InPatient extends Patient implements MedicalRecord {
    private double roomCharges; private String medicalHistory = "";

    public InPatient(int patientId, String name, int age, double roomCharges) {
        super(patientId, name, age); this.roomCharges = roomCharges;
    }

    @Override
    public double calculateBill() {
        // Room charges + fixed service fee
        return roomCharges + 500;
    }

    @Override
    public void addRecord(String record) { medicalHistory += record + "\n"; }

    @Override
    public String viewRecords() { return medicalHistory; }
}

// Class for out-patients
class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee; private String medicalHistory = "";

    //Constructor initialize the OutPatient's data members
    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age); this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        // Only consultation fee for out-patients
        return consultationFee;
    }

    @Override
    public void addRecord(String record) { medicalHistory += record + "\n"; }

    @Override
    public String viewRecords() { return medicalHistory; }
}

// Main class to manage patients
public class HospitalManagement {
    public static void processPatient(Patient patient) {
        System.out.println(patient.getPatientDetails() + ", Bill: " + patient.calculateBill());
    }

    public static void main(String[] args) {
        Patient inPatient = new InPatient(101, "John Doe", 45, 3000);
        Patient outPatient = new OutPatient(102, "Jane Smith", 30, 500);

        ((InPatient) inPatient).addRecord("Diagnosed with fever.");
        ((OutPatient) outPatient).addRecord("Regular checkup.");

        // Display in-patient details
        processPatient(inPatient);
        // Display out-patient details
        processPatient(outPatient);

        System.out.println("In-Patient Records: \n" + ((InPatient) inPatient).viewRecords());
        System.out.println("Out-Patient Records: \n" + ((OutPatient) outPatient).viewRecords());
    }
}

