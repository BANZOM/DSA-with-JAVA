package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] A = { 2, 5, 4, 3, 2, 1 };
        selectionSort2(A);
        printArray(A);

        int[] B = { 10, 9, 8, 7, 6, 5 };
        selectionSort2(B);
        printArray(B);

        int[] C = { 1, 2, 3, 4, 5, 6 };
        selectionSort2(C);
        printArray(C);

        int[] D = { 3, 1, 4, 1, 5, 9 };
        selectionSort2(D);
        printArray(D);
    }

    private static void selectionSort(int[] A) {
        int last = A.length - 1;
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

    private static void selectionSort2(int[] A) {

        for (int i = 0; i < A.length - 1; i++) {
            int minIdx = i; // let set the leftmost index as smallest

            for (int j = i + 1; j < A.length; j++) {
                minIdx = (A[minIdx] < A[j]) ? minIdx : j;
            }

            if (minIdx != i) {
                int temp = A[minIdx];
                A[minIdx] = A[i];
                A[i] = temp;
            }
        }
    }

    private static void printArray(int[] A) {
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
