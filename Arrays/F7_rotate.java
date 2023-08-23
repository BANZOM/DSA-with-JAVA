import java.util.Scanner;

class F7_rotate {
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

    static void rotate(int[] arr) {
        if (arr.length != 1) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}