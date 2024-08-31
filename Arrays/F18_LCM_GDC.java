/*
 * Given two numbers, Find the GCD and LCM of them
 */
public class F18_LCM_GDC {
    public static void main(String[] args) {
        Long num1 = 144L;
        Long num2 = 233L;

        Long[] ans = getLcmAndGcd(num1, num2);

        System.out.println("LCM: " + ans[0]);
        System.out.println("GCD: " + ans[1]);
    }

    static Long[] getLcmAndGcd(Long num1, Long num2) {
        Long[] ans = new Long[2];
        
        ans[1] = getGCD(num1, num2); // GCd

        Long max = Math.max(num1, num2);
        Long min = Math.min(num1, num2);
        Long tmp = max;
        int i = 2;
        while (max % min != 0) {
            max = tmp * i;
            i++;
        }
        ans[0] = max; // LCM

        return ans;
    }

    static Long getGCD(Long num1, Long num2) {
        if(num1 % num2 == 0) return num2;
        return getGCD(num2, num1%num2);
    }
}
