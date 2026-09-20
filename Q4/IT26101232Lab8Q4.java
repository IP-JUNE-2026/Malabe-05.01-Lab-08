import java.util.Scanner;

public class IT26101232Lab8Q4{

   public static void main(String[] args){
	   
	Scanner scanner = new Scanner(System.in);
   
   int studentsArray[] = new int[8];
   int count = 0;
   int IDNum,searchID,i;
   boolean found = false;
   
   while(count < 8){
	   System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
	   IDNum = scanner.nextInt();
	   
	   if(IDNum > 0){
		   studentsArray[count] = IDNum;
		   count++;
	   }else{
		   System.out.println("Error: Please Enter ONLY Positive Numbers");
	   }
   }
   
   System.out.println();
   System.out.print("Enter a Student ID to Search: ");
   searchID = scanner.nextInt();
   
   for(i = 0; i < studentsArray.length; i++){
	   if(studentsArray[i] == searchID){
		 found = true;
		 break;
   }
         
   }
   System.out.println();
   
   if(found == true){
	   System.out.println("Student is Available");
   }else{
	   System.out.println("Student is Not Available");
   }
   }



}