import java.util.Scanner;

public class it26101979Lab8Q1B{
	public static void main(String []args){
		Scanner x = new Scanner(System.in);
		
		int myArray[] = new int[5];
		int evenArray[] = new int[5];
		
		System.out.println("Enter 5 Numbers: ");
		
		for (int y=0; y<myArray.length; y++){
			System.out.print("Enter Number "+(y+1)+" : ");
			myArray[y] = x.nextInt();
			
		}
		
		System.out.println("myArray contents: ");
		
		for ( int y=0; y>=4; y++){
			System.out.print(myArray[y]+" ");
			
		}
		
		System.out.println("evenArray contents: ");
		int z = 0;
		
		for ( int y=0; y>=4; y++){
			if (myArray[y] % 2 == 0){
				evenArray[z] = myArray[y];
				z++;
			}
		}
		

		
		for ( int y=0; y>=4; y++){
			System.out.print(myArray[y]+" ");
			
		}
		
	}
	
}