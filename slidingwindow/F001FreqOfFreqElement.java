package slidingwindow;

import java.util.Arrays;

public class F001FreqOfFreqElement {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 13, 1, 8 };
        int k = 5;
        System.err.println(solve(nums, k));
    }

    private static int solve(int[] nums, int k) {
        int max = 1;
        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 0; i--) {
            int t = k;
            int j = i - 1;
            while (j >= 0 && t > 0) {
                t -= nums[i] - nums[j];
                if (t >= 0) {
                    max = Math.max(max, i - j + 1);
                    j--;
                }
            }
        }

        return max;
    }
}
