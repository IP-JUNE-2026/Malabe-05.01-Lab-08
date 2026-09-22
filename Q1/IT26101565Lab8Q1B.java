import java.util.Scanner;

public class IT26101565Lab8Q1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        // Input 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        int j = 0;

        // Find even numbers
        for (int i = 0; i < 5; i++) {

            if (myArray[i] % 2 == 0) {
                evenArray[j] = myArray[i];
                j++;
            }
        }

        // Print even numbers
        System.out.println("Even numbers:");

        for (int i = 0; i < j; i++) {
            System.out.println(evenArray[i]);
        }
    }
}

