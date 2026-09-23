import java.util.Scanner;

public class IT26101979Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int numbers[] = new int[6];
        
        
        int i = 0;
        while (i < numbers.length) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int input = scanner.nextInt();
            
            if (input > 0) {
                numbers[i] = input;
                i++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }
        
       
        System.out.println("Array Contents:");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();
        
        
        int max = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] > max) {
                max = numbers[j];
            }
        }
        
        
        System.out.println("The Maximum Number Entered: " + max);
        
        scanner.close();
    }
}