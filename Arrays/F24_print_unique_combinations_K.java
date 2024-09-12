import java.util.*;
/*
 * Given N and K, print all unique combinations of K elements from 1 to N
 * eg: N = 4, K = 2
 * then unique combinations are: [1,2], [1,3], [1,4], [2,3], [2,4], [3,4]
 */
public class F24_print_unique_combinations_K {
    public static void main(String[] args) {
        int N = 100;
        int K = 99;
        List<List<Integer>> output = method(N, K);
        System.out.println(output);
    }

    private static List<List<Integer>> method(int N, int K) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if(K == 0) return ans;

        for(int i=1; i<=N-K+1; i++) {
            for (int j = i+1; j <= N-K+2; j++) {
                List<Integer> tmp = new ArrayList<>(Arrays.asList(i));
                int x = j;
                while(x < j+K-1) {
                    tmp.add(x);
                    x++;
                }
                ans.add(tmp);
            }
        }
        return ans;
    }

    
    
}
