import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
/*
 * Find the factors of Number N
 */
public class F20_Factorisation_Concept {
    public static void main(String[] args) {
        int N = 9_999_999;
        printFactors(N);
    }

    static void printFactors(int N) {
        int sqrtOfN = (int) Math.sqrt(N);
        // System.out.println(sqrtOfN);

        List<Integer> list = new ArrayList<>();

        long start = System.nanoTime();
        for(int i=1; i<=sqrtOfN; i++) {
            if (N%i == 0) {
                System.out.println(i);
                if(i != N/i) list.add(0, N/i);
            }
        }
        list.forEach(System.out::println);

        System.out.println("Time taken: " + (System.nanoTime() - start));
    }
}
