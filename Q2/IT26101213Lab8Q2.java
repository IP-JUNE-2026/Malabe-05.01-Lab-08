import java.util.Scanner;
public class IT26101213Lab8Q2 {
    public static void main(String[] args) {
        
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[6];

        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }
		System.out.println();

        System.out.println("A Array Contents:");
        for (int number1 : A) {
            System.out.print(number1 + " ");
        }
        System.out.println();

        System.out.println("B Array Contents:");
        for (int number2 : B) {
            System.out.print(number2 + " ");
        }
        System.out.println();

        System.out.println("C Array Contents (A+B):");
        for (int number3 : C) {
            System.out.print(number3 + " ");
        }
        System.out.println();
    }
}