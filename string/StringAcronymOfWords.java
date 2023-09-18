package string;

import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/
 */
public class StringAcronymOfWords {

    public static void main(String[] args) {
        System.out.println(
                isAcronym(Arrays
                                .asList("never", "gonna", "give", "up", "on", "you"),
                        "ngguoy")
        );
    }

    public static boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) return false;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) return false;
        }
        return true;
    }
}
