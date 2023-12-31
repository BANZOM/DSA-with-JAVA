class F9_max_Sum_SubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, -10, 11 };

        System.out.println("The Max Sum of Subarray is: " + getMaxSum(arr, arr.length));

    }

    /**
     * Finds the maximum sum of a subarray in an array of integers.
     *
     * @param arr The array of integers.
     * @param n   The length of the array.
     * @return The maximum sum of a subarray.
     */
    static long getMaxSum(int[] arr, int n) {
        long max = Integer.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, sum);

            if (sum < 0)
                sum = 0;
        }

        return max;
    }
}