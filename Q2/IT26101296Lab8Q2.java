public class IT26101296Lab8Q2 {
    public static void main(String[] args) {
        
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        
        
        int[] C = new int[5];

        
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.print("Array A: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Array B: ");
        for (int num : B) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Array C (A + B): ");
        for (int num : C) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}