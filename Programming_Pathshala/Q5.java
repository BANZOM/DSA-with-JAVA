import java.util.*;
/*
 * Lower bound in array
 */
public class Q5 extends FastWriter {
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
                int x = in.nextInt(); // x is the element from which the LB is determined

                out.println(getLowerBound(list, 0, n-1, x, n));
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    static Integer getLowerBound(List<Integer> list, int left, int right, int x, int lb) {
        if (left > right) {
            return lb;
        }
        int mid = left + (right-left)/2;

        if (list.get(mid) >= x) {
            lb = Math.min(mid, getLowerBound(list, left, mid-1, x, lb));
        }
        else {
            lb = getLowerBound(list, mid + 1, right, x, lb);
        }
        return lb;
        
    }
}