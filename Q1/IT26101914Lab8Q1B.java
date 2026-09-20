import java.util.Scanner;

public class IT26101914Lab8Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5]; // Maximum size is 5
        int count = 0;

        // Input numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            myArray[i] = input.nextInt();
        }

        // Find even numbers and store them
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[count] = myArray[i];
                count++;
            }
        }

        // Print evenArray
        System.out.println("Even numbers:");
        for (int i = 0; i < count; i++) {
            System.out.println(evenArray[i]);
        }

    }
}