package string;

/**
 * https://leetcode.com/problems/replace-all-digits-with-characters/
 */
public class ReplaceAllDigitsWithCharacter {

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
    }

    public static String replaceDigits(String s) {
        StringBuilder answer = new StringBuilder(s);
        for (int i = 1; i < s.length(); i += 2) {
            int shiftNum = Integer.parseInt(String.valueOf(s.charAt(i)));
            char shiftChar = (char) (s.charAt(i - 1) + shiftNum);
            answer.setCharAt(i, shiftChar);
        }
        return answer.toString();
    }

    public static String replaceDigits1(String s) {
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] += arr[i - 1] - '0';
        }
        return new String(arr);
    }
}
