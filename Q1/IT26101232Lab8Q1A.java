import java.util.Scanner;

public class IT26101232Lab8Q1A{

    public static void main(String[] args){
	 
	Scanner scanner = new Scanner(System.in);
	
	int i;
	
	int myArray[] = new int[5];
	
	System.out.println("Enter 5 Numbers:");
	
	for(i = 0; i < myArray.length; i++){
		System.out.print("Enter Number " + (i + 1) + ": ");
		myArray[i] = scanner.nextInt();
	}
	System.out.println();
	System.out.println("Array in Reverse Order: ");
	
	for(i = myArray.length - 1; i >= 0; i--){
		System.out.print(myArray[i] + " ");
	}
	System.out.println();
	
	
	
	
	}



}