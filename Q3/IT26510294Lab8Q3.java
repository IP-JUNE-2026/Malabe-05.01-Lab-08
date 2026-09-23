import java.util.Scanner;

public class IT26510294Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[6];
        int i = 0;

        while (i < 6) {
            System.out.print("Enter a positive number: ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error! Enter a positive number.");
            } else {
                myArray[i] = num;
                i++;
            }
        }

        int max = myArray[0];

        for (i = 1; i < 6; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        System.out.println("Maximum number: " + max);
    }
}

