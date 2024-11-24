package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] A = { 2, 5, 4, 3, 2, 1 };
        insertionSort(A);
        printArray(A);

        int[] B = { 10, 9, 8, 7, 6, 5 };
        insertionSort(B);
        printArray(B);

        int[] C = { 1, 2, 3, 4, 5, 6 };
        insertionSort(C);
        printArray(C);

        int[] D = { 3, 1, 4, 1, 5, 9 };
        insertionSort(D);
        printArray(D);

        // New test cases
        int[] E = { 0, -1, -2, -3, -4, -5 };
        insertionSort(E);
        printArray(E);

        int[] F = { 100, 50, 25, 12, 6, 3, 1 };
        insertionSort(F);
        printArray(F);

        int[] G = { 5, 5, 5, 5, 5, 5 };
        insertionSort(G);
        printArray(G);

        int[] H = { 1 };
        insertionSort(H);
        printArray(H);

        int[] I = {};
        insertionSort(I);
        printArray(I);
    }

    static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int currentIdx = i - 1;
            int val = A[i]; // Store current element

            // Shift elements right until correct position found
            while (currentIdx >= 0 && A[currentIdx] > val) {
                A[currentIdx + 1] = A[currentIdx];
                currentIdx--;
            }

            // Place element in correct position
            if (currentIdx != i - 1)
                A[currentIdx + 1] = val;
        }
    }

    private static void printArray(int[] A) {
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
