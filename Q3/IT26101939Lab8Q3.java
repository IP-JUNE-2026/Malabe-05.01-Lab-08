import java.util.Scanner;

public class IT26101939Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        // Input 6 positive numbers
        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error! Please enter a positive number.");
                i--;   // Ask for the same position again
            } else {
                numbers[i] = num;
            }
        }

        // Find maximum number
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display array
        System.out.println("\nArray contents:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nMaximum number: " + max);
    }
}