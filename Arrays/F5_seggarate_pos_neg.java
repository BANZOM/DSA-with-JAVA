import java.util.*;
public class F5_seggarate_pos_neg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("Original Array: ");
        printArray(arr);

        seggarate(arr);

        System.out.print("Seggarated Array: ");
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        
        System.out.println();
    }

    static void seggarate(int[] arr) {
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();
        for (int i : arr) {
            if (i >= 0)
                pos.add(i);
            else
                neg.add(i);
        }
        int i=0;
        while(!pos.isEmpty())
            arr[i++] = pos.poll();
        while(!neg.isEmpty())
            arr[i++] = neg.poll();
    }
}
