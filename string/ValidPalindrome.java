package string;

/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        }
        return true;
    }
}
