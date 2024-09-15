import java.util.*;
/*
 * Sum of elements at i,j,k = 0, and they should not same index
 */
public class F31_ThreeSum {

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(Solution.threeSum(nums));
    }

    static class Solution {
        static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums);

            for(int i=0; i<nums.length-2; i++) {
                if(i > 0 && nums[i] == nums[i-1]) continue;

                int left = i+1;
                int right = nums.length-1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if(sum == 0) {
                        ans.add(Arrays.asList(nums[i],nums[left],nums[right]));

                        while (left < right && nums[left] == nums[left+1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right-1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }

            return ans;
        }
    }
}
