import java.util.Scanner; 
public class IT26101437Lab8Q3 {
    public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int i ;  
        int A[] = new int[6];
		 
		  
		for(i =0;i<6;i++){
		System.out.println();	
		System.out.print("Enter a positive Number"+"("+(i+1)+"/6"+"):");
		int num= input.nextInt();
        if( num <0){
		System.out.print("Eror : Not Available");
		
        i--;		
		}
        else{
		A[i] = num; 	
		}
		 
		}	 
		System.out.print(" Array content:");
		for(i =0;i<6;i++){
		System.out.print( A[i]+" ");	
		}
		int large = A[0];

        for (i = 1; i < 6; i++) {

           if (A[i] > large) {
              large = A[i];
           }
        }

		System.out.print("The Maximum Number Entered:" + large);
	}
}