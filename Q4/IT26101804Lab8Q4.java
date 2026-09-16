import java.util.Scanner;

public class IT26101804Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        // Enter Student IDs
        for (int i = 0; i < studentsArray.length; i++) {
            System.out.print("Enter Student ID " + (i + 1) + ": ");
            int id = input.nextInt();

            if (id <= 0) {
                System.out.println("Error: Student ID must be greater than zero.");
                i--; // Ask for the same ID again
            } else {
                studentsArray[i] = id;
            }
        }

        // Search for a Student ID
        System.out.print("Enter a Student ID to search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}
