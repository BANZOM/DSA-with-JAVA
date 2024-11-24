package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] A = { 2, 5, 4, 3, 2, 1 };
        mergeSort(A, 0, A.length - 1);
        printArray(A);

        int[] B = { 10, 9, 8, 7, 6, 5 };
        mergeSort(B, 0, B.length - 1);
        printArray(B);

        int[] C = { 1, 2, 3, 4, 5, 6 };
        mergeSort(C, 0, C.length - 1);
        printArray(C);

        int[] D = { 3, 1, 4, 1, 5, 9 };
        mergeSort(D, 0, D.length - 1);
        printArray(D);

        int[] E = { 0, -1, -2, -3, -4, -5 };
        mergeSort(E, 0, E.length - 1);
        printArray(E);

        int[] F = { 100, 50, 25, 12, 6, 3, 1 };
        mergeSort(F, 0, F.length - 1);
        printArray(F);

        int[] G = { 5, 5, 5, 5, 5, 5 };
        mergeSort(G, 0, G.length - 1);
        printArray(G);

        int[] H = { 1 };
        mergeSort(H, 0, H.length - 1);
        printArray(H);

        int[] I = {};
        mergeSort(I, 0, I.length - 1);
        printArray(I);
    }

    private static void printArray(int[] A) {
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] A, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(A, low, mid);
            mergeSort(A, mid + 1, high);
            merge(A, low, mid, high);
        }
    }

    private static void merge(int[] A, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] leftHalf = new int[n1];
        int[] rightHalf = new int[n2];

        // copy into temporary arrays
        for (int i = low, x = 0; i <= mid; i++, x++)
            leftHalf[x] = A[i];

        for (int i = mid + 1, x = 0; i <= high; i++, x++)
            rightHalf[x] = A[i];

        int k = low;
        int i = 0;
        int j = 0;

        // merging the temporary arrays
        while (i < n1 && j < n2) {
            if (leftHalf[i] <= rightHalf[j]) {
                A[k++] = leftHalf[i++];
            } else {
                A[k++] = rightHalf[j++];
            }
        }

        while (i < n1) {
            A[k++] = leftHalf[i++];
        }

        while (j < n2) {
            A[k++] = rightHalf[j++];
        }

    }
}
