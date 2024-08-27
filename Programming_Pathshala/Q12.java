import java.util.*;
import java.io.*;

/*
 * Leetcode 79: Word Search
 */

public class Q12 extends FastWriter{
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                int row = in.nextInt();
                int col = in.nextInt();
                int[][] list = new int[row][col];

                for (int i = 0; i < row; i++) {
                    // List<Integer> temp = new ArrayList<>();
                    for(int j = 0; j < col; j++) {
                        // temp.add(in.nextInt());
                        list[i][j] = in.nextInt();
                    }
                    // list.add(temp);
                }
                // System.out.println(list.get(0).size());
                System.out.println(list[0].length);
                // System.out.println(list);

                String s = "abc";
                System.out.println(s.length());
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}