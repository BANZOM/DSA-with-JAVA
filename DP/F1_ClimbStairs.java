package DP;
import java.util.*;
/*
 * You are climbing a staircase. It takes n steps to reach the top. 
 * Each time you can either climb 1 or 2 steps. 
 * In how many distinct ways can you climb to the top?
 */
public class F1_ClimbStairs {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }

    private static Map<Integer,Integer> map = new HashMap<>();

    static int climbStairs(int n) {
        if(n<=0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;

        if(map.containsKey(n)) return map.get(n);

        int ways = climbStairs(n-1) + climbStairs(n-2);

        map.put(n,ways);

        return ways;
    }
}
