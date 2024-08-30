/*
 * Given two numbers, find the GCD of them
 */
public class F17_GCD {
    public static void main(String[] args) {
        int num1 = 26;
        int num2 = 13;

        System.out.println(findGCD(num1, num2));
        
    }

    static int findGCD(int num1, int num2) {
        int minNum = Math.min(num1, num2);
        int gdc = 1;

        for(int i=2; i<=minNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gdc = Math.max(gdc, i);
            }
        }

        return gdc;
    }
}
