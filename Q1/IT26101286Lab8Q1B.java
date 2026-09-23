import java.util.Scanner;

public class IT26101286Lab8Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        System.out.println("Enter 5 Numbers");

        for (int index = 0; index < 5; index++) {
            System.out.print("Enter Number " + (index + 1) + ": ");
            myArray[index] = input.nextInt();
        }

        int evenIndex = 0;

        for (int index = 0; index < 5; index++) {
            if (myArray[index] % 2 == 0) {
                evenArray[evenIndex] = myArray[index];
                evenIndex++;
            }
        }

        System.out.println();
        System.out.println("myArray Contents:");

        for (int index = 0; index < 5; index++) {
            System.out.print(myArray[index] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("evenArray Contents:");

        for (int index = 0; index < 5; index++) {
            System.out.print(evenArray[index] + " ");
        }
    }
}