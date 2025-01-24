package Day04_OOPS.Level2;

import java.util.ArrayList;
import java.util.List;

// Represents a patient who can consult multiple doctors
class Patient {
    String name;
    List<Doctor> doctors = new ArrayList<>();

    // Constructor to initialize the name of patient
    Patient(String name) {
        this.name = name;
    }

    // Add doctor who take care of patient
    void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this);
        }
    }
}

// Represents a doctor who can see multiple patients
class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting patient " + patient.name + ".");
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
    }

    void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }
}

// Represents a hospital containing multiple doctors and patients
class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }
}

// Main class to demonstrate the relationships and interactions
public class HospitalManagement{
    public static void main(String[] args) {
        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Kapoor");
        Doctor doctor2 = new Doctor("Dr. Zeena");

        // Create patients
        Patient patient1 = new Patient("Suresh");
        Patient patient2 = new Patient("Ramesh");

        // Create a hospital and add doctors and patients to it
        Hospital hospital = new Hospital("General Hospital");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Demonstrate consultations between doctors and patients
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Display the relationships
        System.out.println(doctor1.name + "'s patients: " + getNames(doctor1.patients));
        System.out.println(doctor2.name + "'s patients: " + getNames(doctor2.patients));
        System.out.println(patient1.name + "'s doctors: " + getNames(patient1.doctors));
        System.out.println(patient2.name + "'s doctors: " + getNames(patient2.doctors));
    }

    private static String getNames(List<?> list) {
        List<String> names = new ArrayList<>();
        for (Object obj : list) {
            if (obj instanceof Patient) {
                names.add(((Patient) obj).name);
            } else if (obj instanceof Doctor) {
                names.add(((Doctor) obj).name);
            }
        }
        return String.join(", ", names);
    }
}

