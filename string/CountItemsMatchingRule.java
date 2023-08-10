package string;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/count-items-matching-a-rule/
 */
public class CountItemsMatchingRule {

    public static void main(String[] args) {
        System.out.println(countMatches(new ArrayList<>() {{
                                            add(new ArrayList<>(List.of("phone", "blue", "pixel")));
                                            add(new ArrayList<>(List.of("computer", "silver", "lenovo")));
                                            add(new ArrayList<>(List.of("phone", "gold", "iphone")));
                                        }},
                "type", "phone"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }
        int count = 0;
        for (List<String> item :
                items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
