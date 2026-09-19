import java.util.Scanner;
public class IT26100247Lab8Q1B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int myArray[] = new int[5];
		int evenArray[] = new int[5];
		int evenIndex = 0; // Keep track of where to insert the next even number to the evenArray
		
		System.out.println("Enter 5 Numbers:");
		for (int i = 0; i < myArray.length; i++){
			System.out.print("Enter Number " + (i + 1 ) + ": ");
			myArray[i] = input.nextInt();
			
			if (myArray [i] % 2 == 0){
				evenArray[evenIndex] = myArray[i];
				evenIndex++;
			}
		}
		System.out.println("\nmy Array Contents:");
		for (int i = 0; i < myArray.length; i++){
			System.out.print(myArray[i] + " ");
		}
		
		System.out.println("\neven Array Contents:");
		for (int i = 0; i < evenArray.length; i++){
			System.out.print(evenArray[i] + " ");
		}
	}
}