import java.util.Scanner;

public class IT26101271Lab8Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        int i = 0;

        while (i < 6) {

            System.out.print("Enter a positive number: ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error! Please enter a positive number.");
            } else {
                numbers[i] = num;
                i++;
            }
        }

        int max = numbers[0];

        for (i = 1; i < 6; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number = " + max);
    }
}