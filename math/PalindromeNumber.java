package math;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(10101));
    }

    public static boolean isPalindrome(int x) {
        StringBuilder xStr = new StringBuilder(String.valueOf(x)).reverse();
        return xStr.toString().equals(String.valueOf(x));
    }

    public static boolean isPalindrome1(int x) {
        String strX = String.valueOf(x);
        int length = strX.length();

        for (int i = 0; i < length / 2; i++) {
            /*
            We check whether the elements at the same distance from
            beginning and from ending are same, if not we return false
             */
            if (strX.charAt(i) != strX.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
