import java.util.Scanner;

public class it26101979Lab8Q1A{
	public static void main(String []args){
		Scanner x = new Scanner(System.in);
		
		int myArray[] = new int[5];
		
		System.out.println("Enter 5 Numbers: ");
		
		for (int y=0; y<myArray.length; y++){
			System.out.print("Enter Number "+(y+1)+" : ");
			myArray[y] = x.nextInt();
			
		}
		
		System.out.println("Array in reverse order: ");
		
		for ( int y=4; y>=0; y--){
			System.out.print(myArray[y]+" ");
			
		}
		
		
	}
	
}