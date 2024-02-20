import java.util.*;

/*
 * Upper Bound in Array
 */

public class Q6 extends FastWriter {
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

                out.println(getUpperBound(list, 0, n-1, x, n));
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    static Integer getUpperBound(List<Integer> list, int left, int right, int x, int ub) {
        if (left > right) {
            return ub;
        }
        int mid = left + (right - left)/2;

        if (list.get(mid) > x) {
            ub = Math.min(mid, getUpperBound(list, left, mid - 1, x, ub));
        }
        else {
            ub = getUpperBound(list, mid + 1, right, x, ub);
        }
        return ub;
    }
}


/*
Input:
3
6
1 2 2 3 3 5
1
5
1 2 5 6 10
10
5
1 4 7 8 10
7

Output:
1
5
3

 */