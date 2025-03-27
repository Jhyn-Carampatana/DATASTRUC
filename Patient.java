public class Patient {
    private int id;
    private int age;
    private BloodData bloodData;

    // Default constructor
    public Patient() {
        this.id = 0;
        this.age = 0;
        this.bloodData = new BloodData(); // Uses default BloodData
    }

    // Overloaded constructor
    public Patient(int id, int age, String bloodType, String rhFactor) {
        this.id = id;
        this.age = age;
        this.bloodData = new BloodData(bloodType, rhFactor);
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }

    // Display method
    public void display() {
        System.out.println("Patient ID: " + id);
        System.out.println("Age: " + age);
        bloodData.display();
    }
}