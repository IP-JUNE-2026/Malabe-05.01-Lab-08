 
public class IT26101437Lab8Q2 {
    public static void main(String[]args){
		
		int i;  
        int A[] = {10, 20, 30, 40, 50} ;
		int B[] = {34, 67, 12, 89, 12} ;
        int C[] = new int[5];
		
        System.out.println("A Array contants :" );
		for(i =0;i<4;i++){
		System.out.print(A[i]+" " );	
		}
		System.out.println();
        System.out.println("B Array contants :"  );
		for(i =0;i<4;i++){
		System.out.print(B[i]+" " );	
		}		
		System.out.println();
		System.out.print("C Array contants(A+B) :"+"\n" );
		for(i =0;i<4;i++){
			C[i] = A[i]+B[i];
		System.out.print( C[i]+" " );	
		}
		 	
		 
		 
		
	}
}