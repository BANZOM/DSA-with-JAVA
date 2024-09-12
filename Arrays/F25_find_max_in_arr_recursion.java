/*
 * Find the maximum element in an Array using Recursion
 */
public class F25_find_max_in_arr_recursion {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,10,3,2,1,5};
        System.out.println(findMax(arr));

    }

    static int findMax(int[] arr) {
        if(arr.length == 0) return -1; // Not exist
        if(arr.length == 1) return arr[0];

        return method(arr,0,arr.length-1); // Divide and Conquer
    }

    private static int method(int[] arr, int i, int j) {
        if(i == j) return arr[i];
        int mid = i+(j-i)/2;
        return Math.max(method(arr, i, mid), method(arr, mid+1, j));
    }
}
