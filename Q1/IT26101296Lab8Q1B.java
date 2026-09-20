import java.util.Scanner;

public class IT26101296Lab8Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        int evenCount = 0;
        for (int num : myArray) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int index = 0;
        for (int num : myArray) {
            if (num % 2 == 0) {
                evenArray[index] = num;
                index++;
            }
        }

        System.out.println("\nEven numbers stored in evenArray:");
        if (evenArray.length == 0) {
            System.out.println("No even numbers found.");
        } else {
            for (int num : evenArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}