import java.util.*;
public class IT26101810Lab8Q3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int pos_array[] = new int[6];
		for(int i=1;i<=6;i++)
		{
			System.out.print("Enter a Positive Number"+"("+i+"/6): ");
			pos_array[i-1]=input.nextInt();
			if(pos_array[i-1]<0 || pos_array[i-1]==0)
			{
				System.out.println("Error: Please Enter ONLY Positive Numbers");
			    i--;
			}
			else
			{
			}
		}
		System.out.println();
		System.out.println("Array Contents:");
		for(int i=0;i<6;i++)
		{
			System.out.print(pos_array[i]+" ");
		}
		System.out.println();
	    int max= pos_array[0];
		for(int i=1;i<pos_array.length;i++)
		{
			if(pos_array[i]>max)
			{
				max=pos_array[i];
			}
		}
		
		System.out.println("The Maximum number Entered: "+max);
	}
}
		