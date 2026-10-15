import java.util.Scanner;

	public class IT26101343Lab8Q1A {
	
		public static void main(String [] args) {
		
			Scanner input = new Scanner(System.in);
			
			int myArray [] = new int [5];
			
			System.out.println("Enter 5 numbers: ");
			
			for (int count = 0;count < myArray.length;count++) {
				
				
				
				System.out.print("Enter number " + (count+1) + ":");
				myArray[count] = input.nextInt();
				
			}
			
            System.out.print("Array in reverse order: ");
			
			for ( int reverse = 4; reverse >= 0;reverse--) {
				
			    System.out.print( myArray[reverse] +" ");
				
			}
			
		}
		
	}
				
