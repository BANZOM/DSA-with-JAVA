/*
 * Given two numbers, find the GCD of them
 */
public class F17_GCD {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 25;

        System.out.println(findGCD(num1, num2));
        
    }

    static int findGCD(int num1, int num2) {
        if(num1 % num2 == 0) return num2;
        return findGCD(num2, num1%num2);
    }
}
