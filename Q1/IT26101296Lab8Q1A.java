import java.util.Scanner;

public class IT26101296Lab8Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[5];


        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("\nArray contents in reverse order:");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        
        System.out.println();
        scanner.close();
    }
}