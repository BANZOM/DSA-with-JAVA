package Dump;

import java.util.ArrayList;
import java.util.List;

public class F3 {
    public static void main(String[] args) {
        String s1 = "A1 man, a plan, a canal: Panam1a"; // True
        String s2 = " "; // True
        String s3 = "racecar"; // True
        String s4 = "No lemon, no melon"; // True
        String s5 = "Was it a car or a cat I saw?"; // True
        String s6 = "Not a palindrome"; // False

        // System.out.println(isPalindrome(s));

        System.out.println("Test 1: ");
        System.out.println(recursiveIsPalindrome(s1, 0, s1.length()-1, true)); // True

        System.out.println("Test 2:");
        System.out.println(recursiveIsPalindrome(s2, 0, s2.length()-1, true)); // True

        System.out.println("Test 3:");
        System.out.println(recursiveIsPalindrome(s3, 0, s3.length()-1, true)); // True

        System.out.println("Test 4:");
        System.out.println(recursiveIsPalindrome(s4, 0, s4.length()-1, true)); // True

        System.out.println("Test 5:");
        System.out.println(recursiveIsPalindrome(s5, 0, s5.length()-1, true)); // True

        System.out.println("Test 6:");
        System.out.println(recursiveIsPalindrome(s6, 0, s6.length()-1, true)); // False
    }

    private static boolean isPalindrome(String s) {
        List<Character> list = new ArrayList<>();
        
        for(Character x: s.toCharArray()) {
            if(Character.isLetterOrDigit(x)) {
                list.add(Character.toLowerCase(x));
            }
        }

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i) + "," + list.get(list.size()-1-i));
            if(list.get(i) != list.get(list.size()-1-i)) {
                return false;
            }
        }

        return true;
    }

    private static boolean recursiveIsPalindrome(String s, int left, int right, boolean yetPalindrome) {
        if(left >= right) return yetPalindrome;

        char leftChar = s.charAt(left);
        char rightChar = s.charAt(right);

        // System.out.println(leftChar + "," + rightChar);

        if(!Character.isLetterOrDigit(leftChar))
            return recursiveIsPalindrome(s, left+1, right, yetPalindrome);
        
        if(!Character.isLetterOrDigit(rightChar))
            return recursiveIsPalindrome(s, left, right-1, yetPalindrome);

        if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
            return false;      
        }

        return recursiveIsPalindrome(s, left+1, right-1, yetPalindrome);
    }
}
