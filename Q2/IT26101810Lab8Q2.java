public class IT26101810Lab8Q2{
	public static void main(String[]args){
		int array_A[]={10,20,30,40,50};
		int array_B[]={34,67,12,89,12};
		int array_C[]=new int[5];
		for(int i =0;i<5;i++)
		{
		array_C[i]=array_A[i]+array_B[i];
		}
		System.out.println("A Array Contents:");
		
		for(int i=0;i<5;i++)
		{
			System.out.print(array_A[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("B Array Contents:");
		for(int i=0;i<5;i++)
		{
			System.out.print(array_B[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("C Array Contents(A+B):");
		for(int i=0;i<5;i++)
		{
			System.out.print(array_C[i]+" ");
		}
		System.out.println();
		
		
	}
}

		
		
		
		
		