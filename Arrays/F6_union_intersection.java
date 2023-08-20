import java.util.Scanner;

public class F6_union_intersection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input Array 1:
        System.out.print("Enter the size of array1: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of array1: ");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        // Input Array 2:
        System.out.print("Enter the size of array2: ");
        int m = in.nextInt();
        System.out.println("Enter the elements of array2: ");
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }

        
    }
}
