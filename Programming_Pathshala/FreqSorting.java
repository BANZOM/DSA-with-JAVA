import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqSorting extends FastReader {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();

        List<Pair> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        map.forEach((key,value) -> {
            list.add(new Pair(key, value));
        });

        for (Pair pair : list) {
            System.out.print(pair.value + " " + pair.freq + "|");
        }
        System.out.println();

        Collections.sort(list); // by default, it'll sort based on increasing order of freq.

        for (Pair pair : list) {
            for (int i = 0; i < pair.getFreq(); i++) {
                System.out.println(pair.value);
            }
        }
        System.out.println();

        // This Sort based on decresing order of their freq
        Collections.sort(list, (o1, o2) -> {
                return (o1.freq != o2.freq) ? o2.freq -  o1.freq: o1.value - o2.value;
            });

        for (Pair pair : list) {
            for (int i = 0; i < pair.getFreq(); i++) {
                System.out.println(pair.value);
            }
        }
        System.out.println();
    }
}

class Pair implements Comparable<Pair> {
    int value;
    int freq = 0;
    
    public Pair(int value, int freq) {
        this.value = value;
        this.freq = freq;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value, int freq) {
        this.value = value;
        this.freq = freq;
    }
    public int getFreq() {
        return freq;
    }
    public void setFreq(int freq) {
        this.freq = freq;
    }
    @Override
    public int compareTo(Pair o) {
       return (this.freq != o.freq) ? this.freq - o.freq: this.value - o.value;
    }
    
}
