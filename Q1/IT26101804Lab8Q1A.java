import java.util.Scanner;

public class IT26101804Lab8Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();
        }

        // Print numbers in reverse order
        System.out.println("Array in reverse order:");

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }

        input.close();
    }
}
