import java.util.Scanner;

public class IT26101286Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int studentsArray[] = new int[8];

        int index = 0;

        while (index < 8) {

            System.out.print("Enter Student ID for Student " + (index + 1) + ": ");
            int studentID = input.nextInt();

            if (studentID <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[index] = studentID;
                index++;
            }
        }

        System.out.print("\nEnter a Student ID to Search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int index2 = 0; index2 < 8; index2++) {
            if (studentsArray[index2] == searchID) {
                found = true;
                break;
            }
        }

        System.out.println();

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
    }
}
