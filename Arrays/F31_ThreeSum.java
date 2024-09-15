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
            Set<List<Integer>> ans = new HashSet<>();
            int n = nums.length;
    
            for(int i=0; i < n-2; i++) {
                List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i]));
                Map<Integer,Integer> map = new HashMap<>();
                int target = 0-nums[i];
    
                for(int j=i+1; j<n; j++) {
                    if(map.containsKey(target-nums[j])) {
                        triplet.add(nums[j]);
                        triplet.add(map.get(target-nums[j]));
                        Collections.sort(triplet);
                        ans.add(triplet);
                        triplet = new ArrayList<>(Arrays.asList(nums[i]));
                    }else {
                        map.put(nums[j],nums[j]);
                    }
                }
            }
    
            return new ArrayList<>(ans);
        }
    }
}
