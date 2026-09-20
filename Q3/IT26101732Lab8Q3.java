import java.util.Scanner;

public class IT26101732Lab8Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        for (int i = 0; i < 6; i++) {

            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                i--;
            } else {
                numbers[i] = number;
            }
        }

        System.out.println("\nArray Contents:");

        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }

        int maximum = numbers[0];

        for (int i = 1; i < 6; i++) {

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + maximum);

        input.close();
    }
}