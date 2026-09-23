import java.util.Scanner;

public class IT26101286Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        int index = 0;

        while (index < 6) {

            System.out.print("Enter a Positive Number (" + (index + 1) + "/6): ");
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[index] = number;
                index++;
            }
        }

        int maximum = numbers[0];

        for (int index2 = 1; index2 < 6; index2++) {
            if (numbers[index2] > maximum) {
                maximum = numbers[index2];
            }
        }

        System.out.println();
        System.out.println("Array Contents:");

        for (int index2 = 0; index2 < 6; index2++) {
            System.out.print(numbers[index2] + " ");
        }

        System.out.println();
        System.out.println("The Maximum Number Entered: " + maximum);
    }
}