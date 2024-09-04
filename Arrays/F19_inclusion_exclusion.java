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

        // Another Extension: Find the count on numbers from 1 to N which are divisible by A,B or C
        N = 20;
        A = 4;
        B = 6;
        int C = 5;

        System.out.println(count(N, A, B, C));
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

    static int count(int N, int A, int B, int C) {
        int countForA = N / A;
        int countForB = N / B;
        int countForC = N / C;

        int extraCountAB = N / getLCM(A, B);
        int extraCountBC = N / getLCM(B, C);
        int extraCountAC = N / getLCM(A, C);
        int extraCountABC = N / getLCM(A, getLCM(B, C));

        return countForA + countForB + countForC - extraCountAB - extraCountBC - extraCountAC + extraCountABC;
    }
}