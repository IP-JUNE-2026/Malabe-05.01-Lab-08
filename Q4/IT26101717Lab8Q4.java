import java.util.Scanner;

public class IT26101717Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8]; 
        
        for (int i = 0; i < studentsArray.length; ) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int id = input.nextInt();

            if (id > 0) {
                studentsArray[i] = id; 
                i++;                  
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
               
            }
        }

        
        System.out.print("Enter a Student ID to Search: ");
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
    }
}
