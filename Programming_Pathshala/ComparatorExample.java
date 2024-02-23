import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ComparatorExample
 */
public class ComparatorExample extends FastReader {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            list.add(in.nextInt());
        }
        
        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
            
        });

        System.out.println(list);
    }
    
}