import java.util.Scanner;

public class IT26101786Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an integer array of size 6
        int[] numbers = new int[6];
        int count = 0;

        // Loop until exactly 6 positive numbers are stored
        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int input = scanner.nextInt();

            // Validate if the number is positive (greater than 0)
            if (input <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[count] = input;
                count++;
            }
        }

        // Find the maximum number
        int max = numbers[0];
        for (int i = 1; i < 6; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print Array Contents
        System.out.println("\nArray Contents:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Print Maximum Number
        System.out.println("The Maximum Number Entered: " + max);
    }
}