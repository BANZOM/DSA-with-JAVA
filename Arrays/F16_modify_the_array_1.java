/*
 * Given an array of size N, contains 0 to N-1 elements, all distinct.
 * Modify the array such that: if A[i] = j, then transform it to A[j] = i;
 */

import java.util.Arrays;

public class F16_modify_the_array_1 {

    public static void main(String[] args) {
        int[] arr = new int[]{0,3,4,2,1};
        
        printModifiedArray(arr, arr.length);
    }

    static void printModifiedArray(int[] arr, int size) {
        
        for(int i=0; i<size; i++) {
            if(arr[i] >= 0) {
                int tmpIdx = i;
                int tmpValue = arr[i];
                while (tmpValue != i) {
                    int nextValue = arr[tmpValue];
                    arr[tmpValue] = -1 * (tmpIdx + 1);
                    tmpIdx = tmpValue;
                    tmpValue = nextValue;
                }
                arr[i] = -1 * (tmpIdx + 1);
            }
        }

        for (int i = 0; i < size; i++) {
            arr[i] = -1* arr[i] - 1;
        }

        System.out.println(Arrays.toString(arr));
    }
    
}
