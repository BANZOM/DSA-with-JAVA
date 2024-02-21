import java.util.*;
import java.io.*;

/*
 * Sum of given range in array: uses concept of prefix sum
 */

public class Q10 extends FastWriter {
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                int n = in.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                }

                int queries = in.nextInt();
                int[][] q = new int[queries][2];
                for (int i = 0; i < queries; i++) {
                    q[i][0] = in.nextInt();
                    q[i][1] = in.nextInt();
                }

                printSum(arr, n, q);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    static void printSum(int[] arr, int size, int[][] q) {
        for (int i = 1; i < size; i++) {
            arr[i] += arr[i-1];
        }

        for (int i = 0; i < q.length; i++) {
            if (q[i][0] == 0) {
                System.out.println(arr[q[i][1]]);
            }
            else
                System.out.println(arr[q[i][1]] - arr[q[i][0] - 1]);
        }
    }
}
/*
 * TC: O(queries)
 */