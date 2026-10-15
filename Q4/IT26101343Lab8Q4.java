import java.util.Scanner;

	public class IT26101343Lab8Q4 {
	
		public static void main (String [] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int studentID [] = new int [8];
			
			int count = 0;
			while (count < studentID.length ) {
			
				System.out.print("Enter the student ID for student" + (count + 1) + ": ");
				int id = sc.nextInt();
				
				
				if( id >= 1 ) {
				
					id = studentID[count] ;
					count++;
					
				}
				
				else {
				
					System.out.println("Error : Please enter ONLY positive numbers.");
					
				}
			}
			

			System.out.println(" ");
			System.out.println("Enter a student ID to search: ");
			int searchID = sc.nextInt();
			
			boolean found = false;
				
			for(int order = 0;order < studentID.length ; order++) {
				
				if(searchID == studentID[order]) {
					
					found = true ;
					break;
				}
					
				else {
					
					
					found = false;	
				}
				
			}
				
				if (found = true) {
					
					System.out.println("Student is available.");
						
				}
				
				else {
					
					System.out.println("Student is not available.");
					
				}
			
			
			
			
		}
		
	}