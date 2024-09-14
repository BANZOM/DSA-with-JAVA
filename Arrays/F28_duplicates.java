import java.util.*;
/*
 * Contains Duplicate
 */
public class F28_duplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(containsDuplicate(nums)); 
    }

    static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums) {
            if(map.containsKey(i)) {
                return true;
            }
            map.put(i,1);
        }
        return false;
    }
}
