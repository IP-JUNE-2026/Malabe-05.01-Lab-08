import java.util.Scanner;

public class IT26101296Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;

        while (count < 6) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int input = scanner.nextInt();

            if (input <= 0) {
                System.out.println("Invalid input! Please enter a positive number (greater than 0).");
            } else {
                numbers[count] = input;
                count++;
            }
        }
		
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nMaximum number in the array: " + max);

        scanner.close();
    }
}