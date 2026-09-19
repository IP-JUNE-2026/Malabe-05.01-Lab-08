import java.util.*;
public class IT26101724Lab8Q4{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int studentsArray[] = new int[8];
		for(int i=1;i<=8;i++)
		{
			System.out.print("Enter Student ID for Student"+i+": ");
			studentsArray[i-1]=input.nextInt();
			if(studentsArray[i-1]<0 || studentsArray[i-1]==0)
			{
				System.out.println("Error: Please Enter ONLY Positive Numbers");
			    i--;
			}
			else
			{
			}
		}
			System.out.println("Enter a Student ID to Search: ");
			int Search_result=input.nextInt();
			System.out.println();
			   boolean found = false;

		for(int j=0;j<8;j++)
		{
			if(Search_result == studentsArray[j])
			{
				found = true;
				break;
			}
		}

		if(found)
		{
			System.out.println("Student is Available");
		}
		else
		{
			System.out.println("Student is Not Available");
		}
			
		}
}
