package string;

/**
 * https://leetcode.com/problems/merge-strings-alternately/
 */
public class MergeAlternateString {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcdef", "12345678"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder shortedString = new StringBuilder();
        String biggerString = "";
        if (word1.length() > word2.length()) {
            shortedString.append(word1, 0, word2.length());
            biggerString = word1;
        } else if (word1.length() < word2.length()) {
            shortedString.append(word2, 0, word1.length());
            biggerString = word2;
        } else {
            shortedString.append(word1);
        }

        StringBuilder mergedString = new StringBuilder();
        for (int i = 0; i < shortedString.length(); i++) {
            mergedString.append(word1.charAt(i));
            mergedString.append(word2.charAt(i));
        }
        if (!biggerString.isEmpty()) {
            mergedString.append(biggerString, shortedString.length(), biggerString.length());
        }
        return mergedString.toString();
    }

    public static String mergeAlternately1(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}
