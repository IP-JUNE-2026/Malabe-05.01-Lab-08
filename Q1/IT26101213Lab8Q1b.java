import java.util.Scanner;
     public class IT26101213Lab8Q1b {
	 public static void main (String[] args) {
	 
	 
	  Scanner input = new Scanner(System.in);
	 int[] number = new int[6];
	 int[] evennumber = new int[6];
	 
	 
	 int i=1;
	 int j=1; 
	 
	 while (i<=5){
	 System.out.println("Enter the Number" + i + ":");
	 number[i]=input.nextInt();
	 i++;
	 }
	 System.out.println("my Array Contents");
	 
	 
	 for(i=1;i<=5;i++){
	 System.out.print( number[i] + " ");
	 }
	 
	 System.out.println();
	 
	 
	 for(i=1;i<=5;i++) {
		 if(number[i]%2==0) {
		 evennumber[i]=number[i];
		 j++;
		 }
	 }
	 System.out.println();
	 
	 
	 System.out.println("even Array Contents");
	 
	 
	 for(i=1;i<=5;i++){
	 System.out.print( evennumber[i] + " ");
	 }
	 
	 System.out.println();
	 
	 }
	 
	 }
	 
	 
	 
	 
	
	 
	 
	 
	 
	 

	 
