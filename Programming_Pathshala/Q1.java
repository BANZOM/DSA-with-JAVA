// getting dublicate in sorted array
/**
 * Q1: https://www.geeksforgeeks.org/find-repeating-element-sorted-array-size-n/
 */
public class Q1 {
    static int answer(int[] arr) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (arr[mid] < mid+1) {
                ans = arr[mid];
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4};
        System.out.println(answer(arr));
    }
    
}