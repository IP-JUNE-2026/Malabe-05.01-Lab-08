import java.util.Scanner;
   public class IT26101213Lab8Q1{
   public static void main(String[] args){
   
   Scanner input= new Scanner(System.in);
   int[] number = new int[6];
  
   System.out.println("Enter the number");
   
   int i=1;
   while(i<=5){
   System.out.println("Enter the number" + i + ":");
    number[i] = input.nextInt();
	i++;
	}
	
	System.out.println(" Array in Reverse Order:");
	
	for(i=5;i<=1;i--) {
  System.out.print( number[i] + " ");
   }
   System.out.println();
   
   }
   
  }
	
	