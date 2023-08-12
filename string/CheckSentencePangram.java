package string;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 */
public class CheckSentencePangram {

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    public static boolean checkIfPangram(String sentence) {
        Set<String> charSet = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            charSet.add(String.valueOf(sentence.charAt(i)));
        }
        return charSet.size() >= 26;
    }
}
