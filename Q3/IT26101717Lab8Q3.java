import java.util.Scanner;

public class IT26101717Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myArray = new int[6]; 

        
        for (int i = 0; i < myArray.length; ) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = input.nextInt();

            if (num > 0) {
                myArray[i] = num; 
                i++;             
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                
            }
        }

        
        System.out.println("Array Contents:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        System.out.println("The Maximum Number Entered: " + max);
    }
}
