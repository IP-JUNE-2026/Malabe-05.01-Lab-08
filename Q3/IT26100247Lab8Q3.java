import java.util.Scanner;

public class IT26100247Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[6];
        int count = 0;

        while (count < numbers.length) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[count] = num;
                count++;
            }
        }

        int max = numbers[0];
        System.out.println("\nArray Contents:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + max);
    }
}