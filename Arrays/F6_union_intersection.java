import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class F6_union_intersection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input Array 1:
        System.out.print("Enter the size of array1: ");
        int n = in.nextInt();

        System.out.println("Enter the elements of array1: ");
        ArrayList<Integer> arr1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr1.add(in.nextInt());
        }

       
        // Input Array 2:
        System.out.print("Enter the size of array2: ");
        int m = in.nextInt();

        System.out.println("Enter the elements of array2: ");
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            arr2.add(in.nextInt());
        }

        int union = findUnion(arr1, arr2, n, m);
        int intersection = n + m - union;
        System.out.println("The union is: " + union);
        System.out.println("The intersection is: " + intersection);
    }

    static int findUnion(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {

        Set<Integer> set = new HashSet<>();

        while(n > 0 || m > 0)
        {
            if(n > 0) {
                set.add(arr1.get(n-1));
                n--;
            }
            if(m > 0) {
                set.add(arr2.get(m-1));
                m--;
            }
        }
        return set.size();
    }
}
