import java.util.Scanner;

public class IT26101286Lab8Q2 {
    public static void main(String[] args) {

        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        for (int index = 0; index < 5; index++) {
            C[index] = A[index] + B[index];
        }

        System.out.println("\n\nA Array Contents:");

        for (int index = 0; index < 5; index++) {
            System.out.print(A[index] + " ");
        }

        
        System.out.println("\n\nB Array Contents:");

        for (int index = 0; index < 5; index++) {
            System.out.print(B[index] + " ");
        }

        
        System.out.println("\n\nC Array Contents (A + B):");

        for (int index = 0; index < 5; index++) {
            System.out.print(C[index] + " ");
        }
    }
}