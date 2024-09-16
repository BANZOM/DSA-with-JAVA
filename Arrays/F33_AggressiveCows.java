/*
 * You are given an array consisting of n integers which denote the position of a stall. 
 * You are also given an integer k which denotes the number of aggressive cows. 
 * You are given the task of assigning stalls to k cows such that the minimum distance between any two of them is the maximum possible.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class F33_AggressiveCows {
    public static void main(String[] args) {
        int numOfCows = 3;
        int[] stalls = new int[]{10, 1, 2, 7, 5};

        System.out.println(solve(numOfCows, stalls));
    }    

    static int solve(int cowsNum, int[] stalls) {
        Arrays.sort(stalls);
        int[] dist = new int[]{1, stalls[stalls.length-1]-stalls[0]};
        int ans = 0;

        while (dist[0] <= dist[1]) {
            int mid = dist[0] + (dist[1]-dist[0])/2;
            if(isPossibleToPlace(stalls,cowsNum,mid)) {
                ans = mid;
                dist[0] = mid+1;
            } else {
                dist[1] = mid-1;
            }
        }

        return ans; 
    }

    static boolean isPossibleToPlace(int[] arr, int N, int dist) {
        int placed = 1;
        int leftPos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[leftPos] >= dist) {
                placed++;
                leftPos = i;
                if (placed >= N) {
                    return true;
                }
            }
        }
        return false;
    }
}
