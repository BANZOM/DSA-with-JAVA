import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

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

        int[] answer = kthByQueue(arr, k);
        System.out.println("Kth smallest element (PQ) is: " + answer[0]);
        System.out.println("Kth maximum element (PQ) is: " + answer[1]);
    }

    static int[] kthByQueue(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();   // by default min heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());   // for max heap
        for (int i : arr) {
            minHeap.add(i);
            maxHeap.add(i);
        }

        for (int i = 0; i < k - 1; i++) {
            minHeap.poll();
            maxHeap.poll();
        }

        return new int[]{minHeap.peek(), maxHeap.peek()};
    }
} 