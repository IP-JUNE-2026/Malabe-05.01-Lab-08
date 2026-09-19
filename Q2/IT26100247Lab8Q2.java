import java.util.Scanner;
public class IT26100247Lab8Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A[] = {10, 20, 30, 40, 50}; // Initializing
		int B[] = {34, 67, 12, 89, 12};
		int C[] = new int [5];
		
		for (int i = 0; i < C.length; i++){
			C[i] = A[i] + B[i];
		}
		System.out.println("A Array Contents:");
		for (int i = 0; i < A.length; i++) System.out.print(A[i] + " ");
		
		System.out.println("\nB Array Contents:");
		for (int i = 0; i < B.length; i++) System.out.print(B[i] + " ");
		
		System.out.println("\nC Array Contents:");
		for (int i = 0; i < C.length; i++) System.out.print(C[i] + " ");
	}
}