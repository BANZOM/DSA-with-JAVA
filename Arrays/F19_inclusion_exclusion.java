import java.util.*;
/**
 * F19_inclusion_exclusion
 * Given a number N, and two nums A and B
 * Find the count of numbers from 1 to N which are divisible by either A or B
 */
public class F19_inclusion_exclusion {

    public static void main(String[] args) {
        int N = 20;
        int A = 4;
        int B = 6;

        System.out.println(count(N, A, B));
    }

    static int count(int N, int A, int B) {
        int ans = 0;
        
        for (int i = 1; i <= N; i++) {
            if (i%A == 0 || i%B == 0) {
                ans++;
            }
        }
        
        return ans;
    }
}