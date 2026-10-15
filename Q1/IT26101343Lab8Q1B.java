import java.util.Scanner;

	public class IT26101343Lab8Q1B {
	
		public static void main(String [] args) {
		
			Scanner input = new Scanner(System.in);
			
			int myArray [] = new int [5];
			int evenArray[] = new int [5];
			int evenCount = 0;
			
			System.out.println("Enter 5 numbers: ");
			
			for (int count = 0;count < myArray.length;count++) {
				
				
				
				System.out.print("Enter number " + (count+1) + ":");
				myArray[count] = input.nextInt();
				
			}
			
            System.out.print("myArray contents: ");
			
			for ( int order = 0; order < myArray.length;order++) {
				
			    System.out.print( myArray[order] +" ");
				
			}
			
			for (int i = 0 ; i < 5 ; i++) {
				
				if(myArray[i] % 2 == 0) {
				
				evenArray[evenCount] = myArray[i];
				
				evenCount++;
				}
			}
			System.out.println();
			System.out.print("evenArray contents: ");
			
			for ( int ecount = 0; ecount < evenArray.length;ecount++) {
				
			    System.out.print( evenArray[ecount] +" ");
			}
			
			
			
			
		}
		
	}
				
