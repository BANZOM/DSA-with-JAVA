/*
 * Find the maximum element in an Array using Recursion
 */
public class F25_find_max_in_arr_recursion {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,10,3,2,1,5,50};
        System.out.println(findMax(arr));
    }

    static int findMax(int[] arr) {
        if(arr.length == 0) return -1;
        if(arr.length == 1) return arr[0];

        return method(arr,arr.length,1, arr[0]);
    }

    static int method(int[] arr, int N, int idx, int prevMax) {
        if(idx != N) {
            prevMax = prevMax < arr[idx] ? method(arr,N,idx+1,arr[idx]) : method(arr, N, idx+1, prevMax);
        }
        return prevMax;
    }
}
