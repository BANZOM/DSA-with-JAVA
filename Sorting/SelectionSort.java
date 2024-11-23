package Basics;

public class SelectionSort {
    public static void main(String[] args) {
        int[] A = { 2, 5, 4, 3, 2, 1 };
        selectionSort(A);
        printArray(A);

        int[] B = { 10, 9, 8, 7, 6, 5 };
        selectionSort(B);
        printArray(B);

        int[] C = { 1, 2, 3, 4, 5, 6 };
        selectionSort(C);
        printArray(C);

        int[] D = { 3, 1, 4, 1, 5, 9 };
        selectionSort(D);
        printArray(D);
    }

    private static void selectionSort(int[] A) {
        int last = A.length-1;
        for (int i = 0; i < A.length; i++) {
            int max = 0;
            for (int j = 0; j < A.length - i; j++) {
                max = A[max] > A[j] ? max : j;
            }
            // swap max with last
            int temp = A[max];
            A[max] = A[last];
            A[last] = temp;
            last--;
        }
    }

    private static void printArray(int[] A) {
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
