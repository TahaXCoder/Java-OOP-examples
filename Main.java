class Patient {
    private String patientId;
    private String name;
    private int age;
    private String medicalHistory; // Stores medical history
    private String prescriptions; // Stores prescriptions as a single string

    // Constructor to initialize patient details
    public Patient(String patientId, String name, int age, String medicalHistory, String prescriptions) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.prescriptions = prescriptions;
    }

    // Getters for non-sensitive data
    public String getPatientID() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Methods to update name and age
    public void updateName(String name) {
        this.name = name;
        System.out.println("Name updated successfully!");
    }

    public void updateAge(int age) {
        if (age > 0) {
            this.age = age;
            System.out.println("Age updated successfully!");
        } else {
            System.out.println("Invalid age. Please enter a valid number.");
        }
    }

    // Method to update medical records (Only authorized doctors can use this)
    public void updateMedicalRecord(String doctorID, String newHistory, String newPrescriptions) {
        if (isAuthorizedDoctor(doctorID)) {
            this.medicalHistory = newHistory;
            this.prescriptions = newPrescriptions;
            System.out.println("Medical record updated successfully by Doctor " + doctorID);
        } else {
            System.out.println("Unauthorized access! Only doctors can update medical records.");
        }
    }

    // Checks if the doctor is authorized
    private boolean isAuthorizedDoctor(String doctorID) {
        String[] authorizedDoctors = {"D001", "D002", "D003"}; // Allowed doctor IDs
        for (String doctor : authorizedDoctors) {
            if (doctor.equals(doctorID)) {
                return true;
            }
        }
        return false;
    }

    // Displays patient details (without medical records)
    public void displayPatientInfo() {
        System.out.println("\nPatient Information:");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Displays medical records (Only for authorized doctors)
    public void displayMedicalRecord(String doctorID) {
        if (isAuthorizedDoctor(doctorID)) {
            System.out.println("\nMedical Record:");
            System.out.println("Medical History: " + medicalHistory);
            System.out.println("Prescriptions: " + prescriptions);
        } else {
            System.out.println("Unauthorized access Only doctors can view medical records.");
        }
    }
}

// Main class to test the Patient class
public class Main {
    public static void main(String[] args) {
        // Creating a new patient
        Patient patient1 = new Patient("P12345", "Taha", 22, "No prior medical issues", "Paracetamol");
        patient1.displayPatientInfo();

        // Updating patient details
        patient1.updateName("Hanzala");
        patient1.updateAge(25);
        patient1.displayPatientInfo();

        // Unauthorized doctor trying to update records
        patient1.updateMedicalRecord("P999", "Diabetes", "Insulin");

        // Authorized doctor updating medical record
        patient1.updateMedicalRecord("D002", "Diabetes Type 2", "Insulin, Metformin");

        // Unauthorized attempt to view medical records
        patient1.displayMedicalRecord("P999");

        // Authorized doctor viewing medical records
    }
}