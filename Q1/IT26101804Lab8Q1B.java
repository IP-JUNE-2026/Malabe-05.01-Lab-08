public class IT26101804Lab8Q1B {

    public static void main(String[] args) {

        int[] myArray = {10, 15, 20, 25, 30, 35, 40};

        // Count even numbers
        int count = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                count++;
            }
        }

        // Create evenArray
        int[] evenArray = new int[count];

        // Store even numbers
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[j] = myArray[i];
                j++;
            }
        }

        // Display evenArray
        System.out.println("Even numbers:");

        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}
