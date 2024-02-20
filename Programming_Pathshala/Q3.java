import java.util.*;
import java.io.*;

/*
 * Binary Search: Just to test the setup
 */

public class Q3 {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                int size = in.nextInt();
                List<Integer> list = new ArrayList<>();
                for(int i=0; i<size; i++) {
                    list.add(in.nextInt());
                }               
                int target = in.nextInt();
                System.out.println(binarySearch(list, target));
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    static Integer binarySearch(List<Integer> list, int target) {
        int left = 0;
        int right = list.size();

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (list.get(mid) == target) {
                return mid;
            }
            if (list.get(mid) < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}