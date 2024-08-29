/*
 * Given an Array and a number K,
 * You have to find the min number of swaps that is needed to bring all the 
 * numbers from Array which are <= K 
 * so to place them together
 */
public class F15_Min_Swaps_to_bring_together {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 12, 20, 20, 5, 19, 19, 12, 1, 20, 1};
        int k = 1;

        System.out.println(minSwaps(arr, k));
    }

    private static int minSwaps(int[] arr, int k) {
        int validElemtnsCount = 0;

        // Count of total valid elements
        for(int element: arr) {
            if (element <= k) validElemtnsCount++;
        }

        if(validElemtnsCount <= 1 || validElemtnsCount == arr.length) return 0;
        
        // Count of elements in first window
        int countInValidSize = 0;
        for(int i=0; i<validElemtnsCount; i++) {
            if(arr[i] <= k) countInValidSize++;
        }

        int minSwapsCount = validElemtnsCount-countInValidSize;

        // Count in next windows, and update the minSwapsCount to get the ans
        for(int i=validElemtnsCount; i<arr.length; i++) {
            if(arr[i] <= k) countInValidSize++;
            if(arr[i-validElemtnsCount] <= k) countInValidSize--;
            
            minSwapsCount = Math.min(minSwapsCount, validElemtnsCount-countInValidSize);
            
        }

        return minSwapsCount;
    }
}
