package slidingwindow;

import java.util.Arrays;

public class F001FreqOfFreqElement {
    public static void main(String[] args) {
        int[] nums = { 1,2,4};
        int k = 5;
        System.err.println(solve(nums, k));
    }

    private static int solve(int[] nums, int k) {
        int freq = 1;
        Arrays.sort(nums);

        int[] prefixSumArray = prefixSumArray(nums);

        for (int i = 1; i < nums.length; i++) {
            int leftCompatible = getLeftCompatible(nums, k, 0, i, prefixSumArray);
            freq = Math.max(freq, i - leftCompatible + 1);
        }

        return freq;
    }

    private static int getLeftCompatible(int[] nums, int k, int left, int right, int[] prefixSumArray) {
        int i = left;
        int j = right;
        int leftCompatible = right;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            int desiredSum = nums[right] * (right - mid + 1);
            int currentSum = (mid != 0) ? prefixSumArray[right] - prefixSumArray[mid - 1] : prefixSumArray[right];

            if (desiredSum - currentSum <= k) {
                leftCompatible = mid;
                j = mid - 1;
            } else
                i = mid + 1;
        }

        return leftCompatible;
    }

    private static int[] prefixSumArray(int[] arr) {
        // System.out.println(Arrays.toString(arr));

        int[] brr = new int[arr.length];
        brr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            brr[i] = arr[i] + brr[i - 1];
        }
        // System.out.println(Arrays.toString(brr));
        return brr;
    }
}
