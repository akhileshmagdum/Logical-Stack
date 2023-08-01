package string;

/**
 * https://leetcode.com/problems/goal-parser-interpretation/
 */
public class GoalParserInterpretation {

    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }

    public static String interpret(String command) {
        String answer = "";
        answer = command.replace("()", "o");
        answer = answer.replace("(al)", "al");
        return answer;
    }
}
