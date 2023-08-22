package string;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("This is the last word"));
    }

    public static int lengthOfLastWord(String s) {
        String[] trimmed = s.split(" ");
        return trimmed[trimmed.length - 1].length();
    }
}
