import java.util.Scanner;

class F7_rotate {
    /**
     * Rotates the given array by one position in a clockwise direction.
     *
     * @param arr The array to be rotated.
     */
    static void rotate(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        
        int lastElement = arr[arr.length - 1];
        System.arraycopy(arr, 0, arr, 1, arr.length - 1);
        arr[0] = lastElement;
    }

    /**
     * Prints the elements of the given array.
     *
     * @param arr The array to be printed.
     */
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Given an array, rotate the array by one position in clock-wise direction.
        /*
         * input: [1,2,3,4,5,6,7]
         * output: [7,1,2,3,4,5,6]
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        System.out.print("Original Array: ");
        printArray(arr);
        rotate(arr);
        System.out.print("Rotated Array: ");
        printArray(arr);
    }
}