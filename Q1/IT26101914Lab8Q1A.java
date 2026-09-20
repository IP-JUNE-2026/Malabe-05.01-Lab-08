import java.util.Scanner;

public class IT26101914Lab8Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];

        // Input numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            myArray[i] = input.nextInt();
        }

        // Print in reverse order
        System.out.println("Numbers in reverse order:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(myArray[i]);
        }

        input.close();
    }
}