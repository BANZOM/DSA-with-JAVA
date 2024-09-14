import java.util.*;
/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the 
 * product of all the elements of nums except nums[i]. The product of any prefix or suffix of nums is 
 * guaranteed to fit in a 32-bit integer. You must write an algorithm that runs in O(n) time and without 
 * using the division operation.
 */
public class F29_product_of_array_except_self {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
    
    static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] ppArray = new int[n];
        int[] spArray = new int[n];

        ppArray[0] = 1;
        for(int i=1; i<n; i++) {
            ppArray[i] = ppArray[i-1] * arr[i-1];
        }

        spArray[n-1] = 1;
        for(int i=n-2; i>=0; i--) {
            spArray[i] = spArray[i+1] * arr[i+1];
        }

        for(int i=1; i<n-1; i++) {
            arr[i] = spArray[i]*ppArray[i];
        }
        arr[0] = spArray[0];
        arr[n-1] = ppArray[n-1];

        return arr;
    }
}