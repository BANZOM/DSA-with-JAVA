/*
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 */
public class F30_kadaneAlgo {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] arr) {
        int sum = 0;
        int max = arr[0];

        for(int i: arr) {
            sum += i;
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
