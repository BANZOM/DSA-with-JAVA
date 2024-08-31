/*
 * Given two numbers, find the GCD of them
 */
public class F17_GCD {
    public static void main(String[] args) {
        int num1 = 9999991;
        int num2 = 9999992;

        System.out.println(findGCD(num1, num2));
        
    }

    static int findGCD(int num1, int num2) {

        while (num1 % num2 != 0) {
            int tmp = num2;
            num2 = num1 % num2;
            num1 = tmp;
        }

        return num2;
    }
}
