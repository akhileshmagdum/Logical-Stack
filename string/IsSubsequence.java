package string;

/**
 * https://leetcode.com/problems/is-subsequence/
 */
public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();
        int lenS = s.length();
        int lenT = t.length();
        int i = 0, appearance = 0;

        if (lenS < 1) return true;

        while (i < lenT) {
            //if character occurs in the t string increment the index of S string
            if (sCharArr[appearance] == tCharArr[i]) {
                appearance++;
            }
            i++;

            //To avoid index out of bound for sCharArr as all the elements would have been iterated
            if (lenS == appearance) return true;
        }
        return false;
    }
}
