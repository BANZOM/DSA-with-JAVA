/*
 * Given an Array and a number K,
 * You have to find the min number of swaps that is needed to bring all the 
 * numbers from Array which are <= K 
 * so to place them together
 */
public class F15_Min_Swaps_to_bring_together {
    public static void main(String[] args) {
        int[] arr = new int[]{1,8,1,6,2,1,5,6,9};
        int k = 3;

        System.out.println(minSwaps(arr, k));
    }

    private static int minSwaps(int[] arr, int k) {
        int start = -1;
        int end = -1;
        int countLessThan3Elements = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= k) {
                end = i;
                if(start == -1) {
                    start = i;
                }
                countLessThan3Elements++;
            }
        }

        System.out.println("Start : " + start + ", End : " + end);

        return 0;
    }
}
