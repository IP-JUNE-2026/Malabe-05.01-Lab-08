import java.util.Scanner;

public class IT26101565Lab8Q1A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];

        // Input 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // Print in reverse order
        System.out.println("Numbers in reverse order:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(myArray[i]);
        }
    }
}

