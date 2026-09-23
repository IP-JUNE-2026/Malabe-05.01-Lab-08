import java.util.Scanner;

public class IT26101979Lab8Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int studentsArray[]= new int[8];
        
        
        int i = 0;
        while (i < studentsArray.length) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int input = scanner.nextInt();
            
            if (input > 0) {
                studentsArray[i] = input;
                i++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }
        
        
        System.out.print("Enter a Student ID to Search: ");
        int searchId = scanner.nextInt();
        
        
        boolean found = false;
        for (int j = 0; j < studentsArray.length; j++) {
            if (studentsArray[j] == searchId) {
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