import java.util.*;

public class Kth_max_min_element_F3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Input array
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = s.nextInt();

        int[] answer = kthElement(arr, k);
        System.out.println("Kth smallest element is: " + answer[0]);
        System.out.println("Kth maximum element is: " + answer[1]);
    }

    static int[] kthElement(int[] arr, int k) {
        Arrays.sort(arr);
        return new int[]{arr[k-1], arr[arr.length - k]};
    }
}