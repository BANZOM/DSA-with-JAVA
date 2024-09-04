/**
 * F19_inclusion_exclusion
 * Given a number N, and two nums A and B
 * Find the count of numbers from 1 to N which are divisible by either A or B
 */
public class F19_inclusion_exclusion {

    public static void main(String[] args) {
        int N = 20;
        int A = 4;
        int B = 6;

        System.out.println(count(N, A, B));
    }

    static int count(int N, int A, int B) {
        int countForA = N / A;
        int countForB = N / B;
        int extraCount = N / getLCM(A, B);
        return countForA + countForB - extraCount;
    }

    static int getLCM(int A, int B) {
        return (A * B) / getHCF(A, B);
    }

    static int getHCF(int A, int B) {
        if (A % B == 0) {
            return B;
        }
        return getHCF(B, A % B);
    }
}