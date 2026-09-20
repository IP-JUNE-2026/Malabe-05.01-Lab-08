import java.util.Scanner;

public class IT26101296Lab8Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int count = 0;

        System.out.println("Enter 8 Student IDs:");
        while (count < 8) {
            System.out.print("Enter Student ID " + (count + 1) + ": ");
            int id = scanner.nextInt();

            if (id <= 0) {
                System.out.println("Invalid input! Student ID must be a positive number.");
            } else {
                studentsArray[count] = id;
                count++;
            }
        }

        System.out.print("\nEnter Student ID to search: ");
        int searchId = scanner.nextInt();

        boolean found = false;
        for (int id : studentsArray) {
            if (id == searchId) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        scanner.close();
    }
}