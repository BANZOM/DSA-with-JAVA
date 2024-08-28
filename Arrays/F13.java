/**
 * F13:
 * Given an Array and three ints P,Q,R
 * Find max Value of eqn: P*A[i] + Q*A[j] + R*A[k]
 * where i < j < k
 */
public class F13 {

    public static void main(String[] args) {
        int[] arr = new int[] {-11, 2, 3, 4, 5};
        int N = 6;
        int P = -1;
        int Q = 2;
        int R = 3;

        System.out.println(calculateMaxValue(arr, N, P, Q, R));
        
    }

    private static long calculateMaxValue(int[] arr, int n, int p, int q, int r) {
        long ans = Long.MIN_VALUE;

        // int[] prefixMax = prefixMaxArray(arr); // only suffixMaxArray is sufficient
        int[] suffixMax = suffixMaxArray(arr,r);
        int[] maxThree = new int[3];
        int prefixMax = arr[0]*p;

        for(int i=1; i<arr.length-1; i++) {
            if(prefixMax + arr[i]*q + suffixMax[i+1] > ans) {
                maxThree[0] = prefixMax;
                maxThree[1] = arr[i]*q;
                maxThree[2] = suffixMax[i+1];
                ans = maxThree[0] + maxThree[1] + maxThree[2];
            }
            prefixMax = Math.max(prefixMax,arr[i]*p);
        }

        System.out.println(maxThree[0] + " " + maxThree[1] + " " + maxThree[2]);

        return ans;
    }

    private static int[] prefixMaxArray(int[] arr, int x) {
        int[] prefixMax = new int[arr.length];
        prefixMax[0] = arr[0]*x;
        for (int i = 1; i < prefixMax.length; i++) {
            prefixMax[i] = Math.max(prefixMax[i-1], arr[i]*x);
        }
        return prefixMax;
    } 
    
    private static int[] suffixMaxArray(int[] arr, int x) {
        int[] suffixMax = new int[arr.length];
        suffixMax[arr.length - 1] = arr[arr.length-1]*x;

        for (int i = arr.length-2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i+1], arr[i]*x);
        }

        return suffixMax;
    } 
    
}