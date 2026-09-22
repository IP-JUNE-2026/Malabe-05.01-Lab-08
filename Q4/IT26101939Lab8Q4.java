import java.util.Scanner;

public class IT26101939Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        // Input Student IDs
        for (int i = 0; i < studentsArray.length; i++) {

            System.out.print("Enter Student ID " + (i + 1) + ": ");
            int id = input.nextInt();

            if (id <= 0) {
                System.out.println("Error! Student ID cannot be zero or negative.");
                i--;
            } else {
                studentsArray[i] = id;
            }
        }

        // Search Student ID
        System.out.print("\nEnter a Student ID to search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int i = 0; i < studentsArray.length; i++) {

            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
    }
}