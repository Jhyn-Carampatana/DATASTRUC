import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String idNumber;
    private String firstName;
    private String lastName;
    private String course;
    private int yearLevel;

  
    public Student(String idNumber, String firstName, String lastName, String course, int yearLevel) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.yearLevel = yearLevel;
    }

   
    public String getIdNumber() { return idNumber; }
    public void setIdNumber(String idNumber) { this.idNumber = idNumber; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public int getYearLevel() { return yearLevel; }
    public void setYearLevel(int yearLevel) { this.yearLevel = yearLevel; }

   
    public String toString() {
        return "ID: " + idNumber + ", Name: " + firstName + " " + lastName + ", Course: " + course + ", Year Level: " + yearLevel;
    }
}


public class StudentClass {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Display All Students in Reverse");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents(false);
                    break;
                case 3:
                    displayStudents(true);
                    break;
                case 0:
                    System.out.println("Exiting the program. Thank you & Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 0);
    }

    
    private static void addStudent() {
        if (students.size() >= 100) {
            System.out.println("Student limit reached (100 students). Cannot add more.");
            return;
        }

        System.out.print("Enter ID Number: ");
        String idNumber = scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Year Level: ");
        int yearLevel = scanner.nextInt();
        scanner.nextLine(); 

       
        Student student = new Student(idNumber, firstName, lastName, course, yearLevel);
        students.add(student);
        System.out.println("Student record added successfully!");
    }

    
    private static void displayStudents(boolean reverse) {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\nStudent Records:");
        if (reverse) {
            for (int i = students.size() - 1; i >= 0; i--) {
                System.out.println(students.get(i));
            }
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}