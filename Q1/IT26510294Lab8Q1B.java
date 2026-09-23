import java.util.Scanner;

public class IT26510294Lab8Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number: ");
            myArray[i] = input.nextInt();
        }

        int j = 1;

        for (int i = 1; i <= 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[j] = myArray[i];
                j++;
            }
        }

        System.out.println("Even numbers:");

        for (int i = 1; i < j; i++) {
            System.out.println(evenArray[i]);
        }
    }
}

