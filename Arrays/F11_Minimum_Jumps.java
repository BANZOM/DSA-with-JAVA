import java.util.Scanner;

public class F11_Minimum_Jumps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        
        System.out.print("Minimum number of jumps: " + minimumJumps(arr, n));
    }

    static int minimumJumps(int[] arr, int n) {
        
    }
}
