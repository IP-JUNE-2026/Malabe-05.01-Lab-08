import java.util.Scanner; 
public class IT26101437Lab8Q4 {
    public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int i ;  
        int studentsArray[] = new int[6];
 		  
		for(i =0;i<6;i++){
		System.out.println();	
		System.out.print("Enter student ID for student"+(i+1)+ ":");
		int num= input.nextInt();
        if( num <0){
		System.out.print("Eror : Not Available");
		
        i--;		
		}
        else{
		studentsArray[i] = num; 	
		}
		 
		}	 
		 System.out.print("Enter a Student ID to Search: ");
        int number = input.nextInt();

        boolean found = false;

        for (i = 0; i < 6; i++) {

            if (number == studentsArray[i]) {
                System.out.println("Student is Available");
                found = true;
                break;
            }
        }

        // If ID is not found
        if (!found) {
            System.out.println("Student is Not Available");
        }

        input.close();
	}
}