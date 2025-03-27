import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        BloodData defaultBloodData = new BloodData();
        System.out.println("Default Blood Data:");
        defaultBloodData.display();

        
        System.out.print("\nEnter Blood Type (O, A, B, AB): ");
        String type = scanner.next();
        System.out.print("Enter Rh Factor (+ or -): ");
        String rh = scanner.next();

        BloodData userBloodData = new BloodData(type, rh);
        System.out.println("\nUser-Entered Blood Data:");
        userBloodData.display();

    
        defaultBloodData.setBloodType(type);
        defaultBloodData.setRhFactor(rh);

        System.out.println("\nUpdated Default Blood Data:");
        defaultBloodData.display();

        scanner.close();
    }
}