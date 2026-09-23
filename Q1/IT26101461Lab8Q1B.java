import java.util.Scanner;

public class IT26101461Lab8Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            myArray[i] = input.nextInt();
        }

        int j = 0;

        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[j] = myArray[i];
                j++;
            }
        }

        System.out.println("Even numbers:");

        for (int i = 0; i < j; i++) {
            System.out.println(evenArray[i]);
        }
    }
}