import java.util.*;
import java.io.*;

// Code Forces Contest: 727 Transform A to B

public class Q9 extends FastWriter {

    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                int n = in.nextInt();
                int expect = in.nextInt();

                List<Integer> list = new ArrayList<>();
                
                out.println(checkConvert(n, expect, list));
                out.println(list);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    static boolean checkConvert(int n, int expect, List<Integer> list) {
        if (n > expect) {
            return false;
        }
        
        list.add(n);

        boolean flag = false;

        flag = checkConvert(2*n, expect, list);

        if (flag) {
            return true;
        }

        flag = checkConvert(10*n-1, expect, list);

        if (flag) {
            return true;
        }

        list.remove(list.size()-1);

        return flag;

    }
}