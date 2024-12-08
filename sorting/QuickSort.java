package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] A = { 2, 5, 4, 3, 2, 1 };
        quickSort(A, 0, A.length - 1);
        printArray(A);

        int[] B = { 10, 9, 8, 7, 6, 5 };
        quickSort(B, 0, B.length - 1);
        printArray(B);

        int[] C = { 1, 2, 3, 4, 5, 6 };
        quickSort(C, 0, C.length - 1);
        printArray(C);

        int[] D = { 3, 1, 4, 1, 5, 9 };
        quickSort(D, 0, D.length - 1);
        printArray(D);

        int[] E = { 0, -1, -2, -3, -4, -5 };
        quickSort(E, 0, E.length - 1);
        printArray(E);

        int[] F = { 100, 50, 25, 12, 6, 3, 1 };
        quickSort(F, 0, F.length - 1);
        printArray(F);

        int[] G = { 5, 5, 5, 5, 5, 5 };
        quickSort(G, 0, G.length - 1);
        printArray(G);

        int[] H = { 1 };
        quickSort(H, 0, H.length - 1);
        printArray(H);

        int[] I = {};
        quickSort(I, 0, I.length - 1);
        printArray(I);
    }

    static void quickSort2(int arr[], int low, int high) {
        if(low < high) {
            int p = partition2(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }

    static int partition2(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;
        
        while(i < j) {
            while(i < high && arr[i] <= pivot) {
                i++;
            }
            while(j > low && arr[j] > pivot) {
                j--;
            }
            
            if(i < j) swap(arr, i, j);
        }
        
        swap(arr, low, j);
        return j;
    }

    private static void printArray(int[] A) {
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] A, int low, int high) {
        if (low >= high)
            return;

        int partitionIdx = getPartitionIdx(A, low, high);
        quickSort(A, low, partitionIdx - 1);
        quickSort(A, partitionIdx + 1, high);
    }

    private static int getPartitionIdx(int[] A, int low, int high) {
        int pivot = A[high]; // considering last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (A[j] < pivot) {
                i++;
                swap(A, i, j);
            }
        }

        swap(A, i+1, high);
        return i+1;
    }

    private static void swap(int[] A, int p, int q) {
        if(p == q) return;
        int temp = A[p];
        A[p] = A[q];
        A[q] = temp;
    }
}
