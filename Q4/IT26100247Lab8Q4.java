import java.util.Scanner;

public class IT26100247Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
	int studentsArray[] = new int [8];
	int count = 0;
	
	while (count < studentsArray.length){
		System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
		int id = input.nextInt();
		
		if (id <= 0){
			System.out.println("Error: Please enter ONLY Positive Numbers");
		} else {
			studentsArray[count] = id;
			count++;
		}
	}
	System.out.print("\nEnter a Student ID to Search: ");
	int searchId = input.nextInt();
	boolean isAvailable = false;
	
	for (int i = 0; i < studentsArray.length; i++){
		if (studentsArray[i] == searchId){
			isAvailable = true;
			break;
		}
	}
	
	if (isAvailable){
		System.out.println("\nStudent is Available");
	} else {
		System.out.println("\nStudent is Not Available");
	}
	}
}
		
	