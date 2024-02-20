import java.util.*;

/*
 * Binary Search using Recursion
 */

public class Q4 extends FastReader {
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                int n = in.nextInt();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    list.add(in.nextInt());
                }

                int target = in.nextInt();

                out.println(binarySearch(list, 0, n-1, target));
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    static Integer binarySearch(List<Integer> list, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right-left)/2;
            if (list.get(mid) == target) {
                return mid;
            }
            if (list.get(mid) < target) {
                return binarySearch(list, mid + 1, right, target);
            }
            else{
                return binarySearch(list, left, mid - 1, target);
            }
        }
        else
            return -1;
    }

    
}