import java.util.*;
/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

public class F26_twoSum {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 18;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(target-arr[i])) {
                ans[0] = map.get(target-arr[i]);
                ans[1] = i;
            }
            else {
                map.put(arr[i],i);
            }
        }

        return ans;
    }
}
