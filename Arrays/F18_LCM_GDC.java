/*
 * Given two numbers, Find the GCD and LCM of them
 */
public class F18_LCM_GDC {
    public static void main(String[] args) {
        Long num1 = 9999991L;
        Long num2 = 9999992L;

        Long[] ans = getLcmAndGcd(num1, num2);

        System.out.println("LCM: " + ans[0]);
        System.out.println("GCD: " + ans[1]);
    }
 

    /*
     * LCM(a,b) * HCF(a,b) = a * b
     */
    static Long[] getLcmAndGcd(Long num1, Long num2) {
        Long[] ans = new Long[2];
        
        ans[1] = getGCD(num1, num2); // GCd

        ans[0] = (num1*num2) / ans[1]; // LCM

        return ans;
    }

    static Long getGCD(Long num1, Long num2) {
        if(num1 % num2 == 0) return num2;
        return getGCD(num2, num1%num2);
    }
}
