import java.util.*;
/*
 * Given N and K, print all unique combinations of K elements from 1 to N
 * eg: N = 4, K = 2
 * then unique combinations are: [1,2], [1,3], [1,4], [2,3], [2,4], [3,4]
 * 
 * O(2^n * K)
 */
public class F24_print_unique_combinations_K {
    public static void main(String[] args) {
        int N = 4;
        int K = 2;
        List<List<Integer>> output = method(N, K,new ArrayList<>(),new ArrayList<>(),1);
        System.out.println(output);
    }

    private static List<List<Integer>> method(int N, int K, List<Integer> tmp, List<List<Integer>> ans, int idx) {
        if(tmp.size() == K) {
            ans.add(new ArrayList<>(tmp));
            return ans;
        }

        if(idx > N) return ans;

        // include
        tmp.add(idx);
        method(N, K, tmp, ans, idx+1);

        tmp.remove(tmp.size() - 1);
        // exclude
        method(N, K, tmp, ans, idx+1);
        
        return ans;
    }

    
    
}
