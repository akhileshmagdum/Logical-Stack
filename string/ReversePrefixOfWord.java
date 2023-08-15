package string;

/**
 * https://leetcode.com/problems/reverse-prefix-of-word/
 */
public class ReversePrefixOfWord {

    public static void main(String[] args) {
        System.out.println(reversePrefix("abedcedf", 'd'));
    }

    public static String reversePrefix(String word, char ch) {
        StringBuilder answer = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                StringBuilder subString = new StringBuilder(word.substring(0, i + 1)).reverse();
                answer.replace(0, i + 1, subString.toString());
                break;
            }
        }
        return answer.toString();
    }
}
