import java.util.*;
public class IT26101810Lab8Q1A{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int myArray[]= new int[5];
	System.out.println("Enter 5 Numbers:");
	for(int i=1;i<=5;i++)
	{
		System.out.print("Enter Number "+i+": ");
		myArray[i-1]=sc.nextInt();
	}
	System.out.println();
	System.out.println("Array in Reverse Order:");
	System.out.println(myArray[4]+" "+myArray[3]+" "+myArray[2]+" "+myArray[1]+" "+myArray[0]);
}
}
	
	
	
	
	
	
	