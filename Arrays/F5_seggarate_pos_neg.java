import java.util.*;
public class F5_seggarate_pos_neg {
    /**
     * Takes an array of integers as input and separates the positive and negative numbers in the array.
     * It then rearranges the array so that all the positive numbers come before the negative numbers.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("Original Array: ");
        printArray(arr);

        segregate(arr);

        System.out.print("Segregated Array: ");
        printArray(arr);
    }

    /**
     * Prints the elements of the array.
     */
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    /**
     * Separates the positive and negative numbers in the array and rearranges the array so that
     * all the positive numbers come before the negative numbers.
     */
    static void segregate(int[] arr) {
        Queue<Integer> negativeQueue = new LinkedList<>();
        int target = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[target++] = arr[i];
            } else {
                negativeQueue.offer(arr[i]);
            }
        }
        while (!negativeQueue.isEmpty()) {
            arr[target++] = negativeQueue.poll();
        }
    }
}
