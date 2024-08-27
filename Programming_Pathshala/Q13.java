/*
Given Input
The first line contains two numbers n and k (1 ≤ n ≤ 100000, 1 ≤ k ≤ 200000) — 
the size of a desired permutation and the number of mergesort calls required to sort it.

Output:
If a permutation of size n such that there will be exactly k calls of mergesort 
while sorting it doesn't exist, output  - 1. 
Otherwise output n integer numbers a[0], a[1], ..., a[n - 1] — the elements of a permutation 
that would meet the required conditions. If there are multiple answers, print any of them.
 */

import java.util.*;
import java.io.*;

public class Q13 extends FastWriter {
    
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                int n = in.nextInt();
                int k = in.nextInt();

                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = i+1;
                }

                solve(arr, n, k);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    static void solve(int[] arr, int n, int d) {
        if (d%2 == 0) {
            System.out.println("-1");
        }
    }

    int[] mergesort(int[] arr, int left, int right, int d) {
        String s = new String();
        s.toCharArray()
        
        return arr;
    }
}