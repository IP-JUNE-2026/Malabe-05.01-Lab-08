public class IT26102029Lab8Q2 {
    public static void main(String[] args) {
        // Initialize arrays A and B with given values
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        // Calculate A + B and store in array C
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        // Display contents of Array A
        System.out.println("A Array Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        // Display contents of Array B
        System.out.println("B Array Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        // Display contents of Array C (A + B)
        System.out.println("C Array Contents (A+B):");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}