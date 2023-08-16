import java.util.Arrays;
import java.util.Scanner;
public class F3_Kth_max_min_element {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = s.nextInt();

        Arrays.sort(arr);
        int kthSmallest = arr[k-1];
        int kthLargest = arr[arr.length - k];

        System.out.println("Kth smallest element is: " + kthSmallest);
        System.out.println("Kth maximum element is: " + kthLargest);
    }
} 