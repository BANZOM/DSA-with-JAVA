class F4_sort_012 {
    public static void main(String[] args) {
        int[] arr = { 2,2,1,0,1,2,0,0,1,2,1,1,1 };
        System.out.print("Original Array: ");
        printArray(arr);

        // Approach 1: just do simple sorting
        // Approach 2: count then put into array
        // Approach 3: use priority queue
        // Approach 4: Dutch National Flag Algorithm

        dutchSort(arr);

        System.out.print("Sored 0,1,2 Array: ");
        printArray(arr);
    }

    static void dutchSort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int i=0;
        while (i <= end) {
            if (arr[i] == 0) {
                swap(arr, i, start);
                start++;
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, end);
                end--;
            } else {
                i++;
            }
        }
    }
    static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}