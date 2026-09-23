import java.util.Scanner;

public class IT26101286Lab8Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];

        System.out.println("Enter 5 Numbers");

        for (int index = 0; index < 5; index++) {
            System.out.print("Enter Number " + (index + 1) + ": ");
            myArray[index] = input.nextInt();
        }

        System.out.println();
        System.out.println("Array in Reverse Order:");

        for (int index = 4; index >= 0; index--) {
            System.out.print(myArray[index] + " ");
        }
    }
}