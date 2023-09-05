package stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]()"));
    }

    public static boolean isValid(String s) {
        Stack<Character> parenthesesStack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (ch.equals('(') || ch.equals('[') || ch.equals('{')) {
                parenthesesStack.push(ch);
            } else {
                //If the first element itself is not an opening bracket return false
                if (parenthesesStack.empty()) {
                    return false;
                }

                //The topmost open bracket should be closed
                Character top = parenthesesStack.peek();
                if ((top.equals('(') && ch.equals(')')) ||
                        (top.equals('[') && ch.equals(']')) ||
                        (top.equals('{') && ch.equals('}'))) {
                    parenthesesStack.pop();
                } else { //Not closed hence return false
                    return false;
                }
            }
        }
        //If all the brackets are opened and closed then the stack would be empty
        return parenthesesStack.empty();
    }
}
