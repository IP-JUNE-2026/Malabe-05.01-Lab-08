public class IT26102007Lab8Q2 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("A Array Contents:");
        for (int val : A) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("B Array Contents:");
        for (int val : B) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("C Array Contents (A + B):");
        for (int val : C) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}