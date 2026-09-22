public class IT26101939Lab8Q2 {
    public static void main(String[] args) {

        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};

        int[] C = new int[5];

        // Calculate A + B and store in C
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Print Array C
        System.out.println("Array C:");

        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}