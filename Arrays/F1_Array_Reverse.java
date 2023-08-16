public class F1_Array_Reverse {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -8, 7, 3, -2 };
        System.out.print("Original Array: ");
        printArray(arr);
        reverseArray(arr);
        System.out.print("Reversed Array: ");
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}