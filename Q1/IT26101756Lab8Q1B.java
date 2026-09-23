import java.util.Scanner;
public class IT26101756Lab8Q1B
{
	public static void main(String[]args)
	{
		int[]myArray=new int[5];
		int[]evenArray=new int[5];
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter 5 numbers:");
		for(int i=0;i<myArray.length;i++)
		{
			System.out.print("enter number"+(i+1)+":");
			myArray[i]=scanner.nextInt();
		}
		int evenIndex=0;
		for(int i=0;i<myArray.length;i++)
		{
			if(myArray[i]%2==0)
			{
			evenArray[evenIndex]=myArray[i];
			evenIndex++;
		}
	}
	System.out.println("\nmyArray Contents:");
	for(int i=0;i<myArray.length;i++)
	{
		System.out.print(myArray[i]+"");
	}
	System.out.println();
	System.out.println("\nevenArray Contents:");
	for(int i=0;i<evenArray.length;i++)
	{
		System.out.print(evenArray[i]+" ");
	}
		System.out.println();
		scanner.close();
	}
}
