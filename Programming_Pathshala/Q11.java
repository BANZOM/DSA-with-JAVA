/*
 * Q11: prefix max array
 */
public class Q11 extends FastWriter{
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                int n = in.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                }
                int idxCount = in.nextInt();
                int[] idxs = new int[idxCount];
                for (int i = 0; i < idxCount; i++) {
                    idxs[i] = in.nextInt();
                }

                printMaxFromIdx(arr, idxs);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    static void printMaxFromIdx(int[] arr, int[] idxs) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.max(arr[i], arr[i-1]);
        }

        for (int i = 0; i < idxs.length; i++) {
            System.out.println(arr[idxs[i]]);
        }
    }
}

/*
 * TC: O( max(n,idxs) )
 */