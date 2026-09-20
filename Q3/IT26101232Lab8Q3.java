import java.util.Scanner;

public class IT26101232Lab8Q3{

   public static void main(String[] args){
   
   Scanner scanner = new Scanner(System.in);
   
   int myArray[] = new int[6];
   int count = 0;
   int number,i;
   int maxNum = myArray[0];
      
   while(count < 6){
	   System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
	   number = scanner.nextInt();
	   
	   if(number > 0){
		   myArray[count] = number;
		   count++;
	   }else{
		   System.out.println("Error: Please Enter ONLY Positive Numbers");
	   }
	   
   }
   System.out.println();
   System.out.println("Array Contents:");
   for(i = 0; i < myArray.length; i++){
	   System.out.print(myArray[i] + " ");
   }
   
   System.out.println();
   
   for(i = 1; i < myArray.length; i++){
	   if(myArray[i] > maxNum){
		   maxNum = myArray[i];
	   }
   }
   
   System.out.println("The maximum Number Entered: " + maxNum);
   
     }

}