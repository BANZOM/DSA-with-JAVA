import java.util.*;
/*
 * Pringing the prime num upto 1 to N
 */
public class F22_Sieve_of_Eratosthenese {
    public static void main(String[] args) {
        int N = 100;
        List<Integer> primeNumbers = seiveOfEratosthenese(N);
        primeNumbers.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    static List<Integer> seiveOfEratosthenese(int N) {
        int[] prime = new int[N];
        
        for(int i=1; i<=N; i++) prime[i-1] = i;
        prime[0] = 0;
        for(int i=0; i<Math.sqrt(N); i++) {
            int val = prime[i];
            if(val != 0)
                for(int j = val*val; j<=N; j+=val) {
                    prime[j-1] = 0;
                }
        }
        
        List<Integer> primeList = new ArrayList<>();
        
        for(int i=0; i<N; i++)
            if(prime[i] != 0) primeList.add(prime[i]);
            
        return primeList;
    }
}
