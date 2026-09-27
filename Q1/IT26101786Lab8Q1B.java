import java.util.Scanner;

public class IT26101786Lab8Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] myArray = new int[5];
        int[] evenArray = new int[5]; // Initialize evenArray with size 5

        // Input 5 numbers from the keyboard
        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        // Find even numbers and store them in evenArray sequentially
        int evenCount = 0;
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[evenCount] = myArray[i];
                evenCount++;
            }
        }

        // Print myArray contents
        System.out.println("\nmyArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        // Print evenArray contents
        System.out.println("\nevenArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println(); // Prints a new line at the end

    }
}