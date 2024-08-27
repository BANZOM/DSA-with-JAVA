/**
 * F13:
 * Given an Array and three ints P,Q,R
 * Find max Value of eqn: P*A[i] + Q*A[j] + R*A[k]
 * where i < j < k
 */
public class F13 {

    public static void main(String[] args) {
        int[] arr = new int[] {-1, -2, -3, 1, 2, 3};
        int N = 6;
        int P = -2;
        int Q = 2;
        int R = 3;

        System.out.println(calculateMaxValue(arr, N, P, Q, R));
        
    }

    private static long calculateMaxValue(int[] arr, int n, int p, int q, int r) {
        long ans = Long.MIN_VALUE;

        int[] prefixMax = prefixMaxArray(arr);
        int[] suffixMax = suffixMaxArray(arr);

        int[] maxThree = new int[3];
        
        for(int i=1; i<arr.length-1; i++) {
            if(prefixMax[i-1] + arr[i] + suffixMax[i+1] > ans) {
                maxThree[0] = prefixMax[i-1];
                maxThree[1] = arr[i];
                maxThree[2] = suffixMax[i+1];
                ans = prefixMax[i-1] + arr[i] + suffixMax[i+1];
            }
        }

        return ans;
    }

    private static int[] prefixMaxArray(int[] arr) {
        int[] prefixMax = new int[arr.length];
        prefixMax[0] = arr[0];
        for (int i = 1; i < prefixMax.length; i++) {
            prefixMax[i] = Math.max(prefixMax[i-1], arr[i]);
        }
        return prefixMax;
    } 
    
    private static int[] suffixMaxArray(int[] arr) {
        int[] suffixMax = new int[arr.length];
        suffixMax[arr.length - 1] = arr[arr.length-1];

        for (int i = arr.length-2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i++], arr[i]);
        }

        return suffixMax;
    } 
    
}