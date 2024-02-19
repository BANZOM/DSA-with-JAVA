/*
 * Q2: Leetcode 162: Find Peak Element: 
 */
public class Q2 {
    static int answer(int[] arr) {
        int low = 0;
        int high = arr.length;
        if(arr.length == 1) {
            return 0;
        }
        while (low <= high) {
            int mid = low + (high - low)/2;
            int left = mid-1>=0? arr[mid-1]:Integer.MIN_VALUE;
            int right = mid+1<arr.length? arr[mid+1]: Integer.MIN_VALUE;

            if (left < arr[mid] && arr[mid] > right) {
                return mid;
            }
            if (left <= arr[mid] && arr[mid] < right) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(answer(arr));
    }
}
