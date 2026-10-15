import java.util.Scanner;

	public class IT26101343Lab8Q3 {
	
		public static void main (String [] args) {
		
			Scanner input = new Scanner(System.in);
			int num1;
			int num2;
			int max = 0;
			int count = 0;
			int numbers [] = new int [6];
			
			while( count < numbers.length ) {
				
				System.out.print("Enter a positive number " + (count + 1) + "/6 : ");
				int number = input.nextInt();
				
					if( number >= 1 ) {
						
						
						numbers [count] = number;
						count++;
						continue;
						
					}
					
					else {
						
						System.out.println("Error : Please enter ONLY Positive numbers");
						
						
					}
					
			}
			
			System.out.println("Array Contents: ");
			for ( int order = 0 ; order < numbers.length ; order++) {
				
				System.out.print(numbers[order] + " " );
				
			}
			
			int largest = numbers [0];
			for (int count2 = 1 ; count2 < numbers.length ; count2++) {
				
				if ( numbers[count2] > largest) {
					
					largest = numbers[count2];
					
					
					
				}
				
				else {
					
					continue;

                }
			

			}
			
			System.out.println();
			System.out.println("The maximum number entered: " + largest );
			
		}
		
	}
			