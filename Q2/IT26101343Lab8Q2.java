import java.util.Scanner;

	public class IT26101343Lab8Q2 {
	
		public static void main(String [] args) {
		
			Scanner input = new Scanner(System.in);
			
			int A [] = new int [5];
			int B [] = new int [5];
			int C [] = new int [5];
			
			
			System.out.print("A array contents: ");
			for (int aOrder = 0;aOrder < 5;aOrder++) {
					
				A[aOrder] = input.nextInt();
				
			}
			
			System.out.println();
			System.out.print("B array contents: ");
			
			for (int bOrder = 0;bOrder < 5;bOrder++) {
				
				B[bOrder] = input.nextInt();
					
			}
			
			System.out.println();
			System.out.print("C Array contents ( A + B) : ");
			
			for ( int count = 0; count < 5 ;count++) {
				
				C[count] = A[count] + B[count];
				System.out.print( (C[count]) +" ");
				
			}
			
		}
		
	}
			
			
			
			
			