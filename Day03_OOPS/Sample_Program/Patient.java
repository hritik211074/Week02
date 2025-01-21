package Day03_OOPS.Sample_Program;

class Patient{
    // Static variable
    static String hospitalName = "City Hospital";

    // Static variable to count total patients
    static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Final variable
    private final int patientID;

    // Static method to get the total number of patients
    static int getTotalPatients() {
        return totalPatients;
    }

    // Constructor
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Method to display patient details
    public void displayDetails() {

        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        }
    }

    public static void main(String[] args) {
        // Creating patient objects
        Patient p1 = new Patient("Ram", 30, "Flu", 101);
        Patient p2 = new Patient("Shyam", 25, "Injury", 102);

        // Display patient details
        p1.displayDetails();
        p2.displayDetails();

        // Display total number of patients
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
    }
}

