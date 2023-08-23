import java.util.Scanner;

public class F8_rotate_by_k {
    /**
     * Prints the elements of the given array.
     *
     * @param arr The array to be printed.
     */
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Rotates the given array by one position in a clockwise direction.
     * n = 4
     * arr[] = {5, 6, 7, 8}
     * k = 3
     * after rotate: {8, 5, 6, 7}
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        System.out.print("Enter the value of k: ");
        int k = in.nextInt();

        System.out.print("Original Array: ");
        printArray(arr);
        rotateByKtimes(arr, n, k);
        System.out.print("Rotated Array: ");
        printArray(arr);
    }

    private static void rotateByKtimes(int[] arr, int n, int k) {
        if (n==0 || k==0) {
            return;
        }
        int[] temp = new int[n];
        k = n + k%n;  // to handle negative k
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

}
