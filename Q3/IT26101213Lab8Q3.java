import java.util.Scanner;

public class IT26101213Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;

        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[count] = num;
                count++;
            }
        }

        System.out.println("\nArray Contents:");
        for (int num : numbers); 
			System.out.print(num + " ");

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max);
				max = num;
        }

        System.out.println("\nThe Maximum Number Entered: " + max);
    }
}