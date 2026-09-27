import java.util.Scanner;

public class IT26101786Lab8Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define an array called myArray with a size of 5
        int[] myArray = new int[5];

        // Input 5 numbers from the keyboard
        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        // Print the contents in reverse order
        System.out.println("\nArray in Reverse Order:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println(); // Prints a new line at the end
        
        scanner.close();
    }
}