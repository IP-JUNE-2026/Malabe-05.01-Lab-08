import java.util.Scanner;

public class IT26101786Lab8Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an integer array to store 8 Student IDs
        int[] studentsArray = new int[8];
        int count = 0;

        // Loop until exactly 8 positive Student IDs are stored
        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int input = scanner.nextInt();

            // Validate if the ID is positive (greater than 0)
            if (input <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[count] = input;
                count++;
            }
        }

        // Ask user to enter a Student ID to search
        System.out.print("\nEnter a Student ID to Search: ");
        int searchId = scanner.nextInt();

        // Search the array to check if the ID is available
        boolean isFound = false;
        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchId) {
                isFound = true;
                break; // Exit loop early since student is found
            }
        }

        // Display the search results
        if (isFound) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

    }
}