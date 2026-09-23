import java.util.Scanner;

public class IT26510294Lab8Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myArray = new int[6];

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            myArray[i] = input.nextInt();
        }

        System.out.println("Array in reverse order:");

        for (int i = 5; i >= 1; i--) {
            System.out.println(myArray[i]);
        }
    }
}