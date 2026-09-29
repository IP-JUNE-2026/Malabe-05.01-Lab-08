import java.util.Scanner;
public class IT26101437Lab8Q1B {
    public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
        int myArray[] = new int[5];
		int evenArray[] = new int[5];
        int i;
        System.out.print("Enter 5 Numbers:"+"\n");
        		
		for(i = 0;i<5;i++){
			System.out.print("Enter Number"+(i+1)+":");
			myArray[i] = input.nextInt();	
		}
		System.out.print(" myArray contant :" );
		for(i=0;i<5;i++){
			
			System.out.print( myArray[i]+" ");
			 
		}
		System.out.println();
		System.out.println("evenArray contant : "+"\n");
		for(i = 0;i<5;i++){
			if (myArray[i] %2 ==0){
				evenArray[i] = myArray[i] ;
			}else{
				evenArray[i] = 0;
			}
			System.out.print( evenArray[i]+"  " );
		}
		 
		
	}
}