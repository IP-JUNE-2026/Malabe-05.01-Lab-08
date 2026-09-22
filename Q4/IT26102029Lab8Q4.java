import java.util.Scanner;

public class IT26102029Lab8Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int count = 0;

        // Loop to input Student IDs for 8 students with validation
        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int input = scanner.nextInt();

            if (input > 0) {
                studentsArray[count] = input;
                count++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        // Ask user to enter a Student ID to search
        System.out.print("Enter a Student ID to Search: ");
        int searchId = scanner.nextInt();
        boolean isAvailable = false;

        // Search through the array
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchId) {
                isAvailable = true;
                break;
            }
        }

        // Display search results
        if (isAvailable) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        scanner.close();
    }
}