import java.util.*;;
/*
 * PS: Given N doors which are Closed initially,
 * Given N doors and N persons. The doors are numbered from 1 to N and 
 * persons are given id’s numbered from 1 to N. Each door can have only two statuses 
 * i.e. open (1) or closed (0) . Initially all the doors have status closed. Find the final status 
 * of all the doors, when all the persons have changed the status of the doors of which they are authorized. 
 * i.e. if status open then change the status to closed and vice versa. A person with id ‘i’ is 
 * authorized to change the status of door numbered ‘j’ if ‘j’ is a multiple of ‘i’.
 * Note: A person has to change the current status of all the doors for which he is authorized exactly once.
 * 
 */
public class F21_Open_Close_Doors {
    public static void main(String[] args) {
        int N = 10;
        List<Integer> ans = getFinalResult(N);
        ans.forEach(System.out::println);
    }

    static List<Integer> getFinalResult(int N) {

    }
}
