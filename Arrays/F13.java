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

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    ans = Math.max(ans, p*arr[i] + q*arr[j] + r*arr[k]);
                }
            }
        }

        return ans;
    }

    
    
}