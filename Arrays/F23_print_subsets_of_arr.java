import java.util.*;

/**
 * F23_print_subsets_of_arr: Given a arr of N numbers, you need to print all
 * subsets of that arr.
 */
public class F23_print_subsets_of_arr {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        ArrayList<ArrayList<Integer>> subsets = getSubset(arr,0,new ArrayList<Integer>(), new ArrayList<ArrayList<Integer>>());

        Collections.sort(subsets, new Comparator<ArrayList<Integer>>() {

            @Override
            public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
                int minSize = Math.min(list1.size(), list2.size());
                for (int i = 0; i < minSize; i++) {
                    int tmp = list1.get(i).compareTo(list2.get(i));
                    if(tmp != 0) return tmp;
                }

                return list1.size() - list2.size();
            }
            
        });

        System.out.println(subsets);
    }

    static ArrayList<ArrayList<Integer>> getSubset(int[] arr,int idx, ArrayList<Integer> set, ArrayList<ArrayList<Integer>> arrayList ) {
        if (idx == arr.length) {
            arrayList.add(set);
            return arrayList;
        }
        ArrayList<Integer> set1 = new ArrayList<>(set);
        set1.add(arr[idx]);
        getSubset(arr, idx+1, set1, arrayList);
        getSubset(arr, idx+1, set, arrayList);
        return arrayList;
    }
}