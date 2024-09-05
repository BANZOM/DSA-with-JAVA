/*
 * Find the factors of Number N
 */
public class F20_Factorisation_Concept {
    public static void main(String[] args) {
        int N = 20;
        printFactors(N);
    }

    static void printFactors(int N) {
        for(int i=1; i<=N/2; i++) {
            if (N%i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(N);
    }
}
