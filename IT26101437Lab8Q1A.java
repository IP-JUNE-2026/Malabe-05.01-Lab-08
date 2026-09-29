import java.util.Scanner;
public class IT26101437Lab8Q1A {
    public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
        int myArray[] = new int[5];
        int i;
        System.out.print("Enter 5 Numbers:"+"\n");
        		
		for(i = 0;i<5;i++){
			System.out.print("Enter Number"+(i+1)+":");
			myArray[i] = input.nextInt();	
		}
		for(i=4;i>(-1);i--){
			System.out.println( myArray[i]);
			 
		}
		
	}
}