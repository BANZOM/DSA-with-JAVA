/*
 * You are given an array consisting of n integers which denote the position of a stall. 
 * You are also given an integer k which denotes the number of aggressive cows. 
 * You are given the task of assigning stalls to k cows such that the minimum distance between any two of them is the maximum possible.
 */
public class F33_AggressiveCows {
    public static void main(String[] args) {
        int numOfCows = 3;
        int[] stalls = new int[]{1, 2, 4, 8, 9};

        System.out.println(solve(numOfCows, stalls));
    }    

    static int solve(int cowsNum, int[] stalls) {
        return 0;
    }
}
