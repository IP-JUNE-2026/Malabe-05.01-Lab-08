import java.util.Scanner;
public class IT26101756Lab8Q3
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		int[]numbers=new int[6];
		int i=0;
		while(i<6)
		{
			System.out.print("enter a positive number("+(i+1)+"/6):");
			int num=scanner.nextInt();
			if(num<=0)
			{
				System.out.println("Error:please enter only Positive Numbers");
			}
			else
			{
				numbers[i]=num;
				i++;
			}
		}
		System.out.println("\nArray Contents:");
		for(int j=0;j<numbers.length;j++)
		{
			System.out.print(numbers[j]+" ");
		}
		System.out.println();
		int max=numbers[0];
		for(int j=1;j<numbers.length;j++)
		{
			if (numbers[j] > max) {
                max = numbers[j];
            }
        }

        System.out.println("The Maximum Number Entered: " + max);

        scanner.close();
    }
}