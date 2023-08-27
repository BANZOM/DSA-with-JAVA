import java.util.*;
/*
 * Given the heights of N towers and a value of K, 
 * Either increase or decrease the height of every tower by K (only once) where K > 0. 
 * After modifications, the task is to minimize the difference between the heights of the longest and the shortest tower and output its difference.
 */

class F10_MinOf_Max_Heights_Diff {
    static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.print("Original Array: ");
        printArray(arr);
        System.out.println("Enter the value of K: ");
        int k = s.nextInt();

        F10_MinOf_Max_Heights_Diff instance = new F10_MinOf_Max_Heights_Diff();

        System.out.println("Min of Max Heights Diff: " + instance.minOfMaxHeightsDiff(arr, n, k));

    }

    public int minOfMaxHeightsDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {
            int left = Math.min(arr[0] + k, arr[i] - k);
            int right = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            ans = Math.min(ans, right - left);
        }

        return ans;
    }
}