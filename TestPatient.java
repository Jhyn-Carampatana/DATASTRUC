import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Patient defaultPatient = new Patient();
        System.out.println("Default Patient:");
        defaultPatient.display();

      
        System.out.print("\nEnter Patient ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Blood Type (O, A, B, AB): ");
        String type = scanner.next();
        System.out.print("Enter Rh Factor (+ or -): ");
        String rh = scanner.next();

        Patient userPatient = new Patient(id, age, type, rh);
        System.out.println("\nUser-Entered Patient:");
        userPatient.display();
      
      
        System.out.print("\nEnter Patient ID (third patient): ");
        int id2 = scanner.nextInt();
        System.out.print("Enter Age (third patient): ");
        int age2 = scanner.nextInt();

        Patient thirdPatient = new Patient(id2, age2, "O", "+");
        System.out.println("\nThird Patient with Default Blood Data:");
        thirdPatient.display();

        scanner.close();
    }
}
