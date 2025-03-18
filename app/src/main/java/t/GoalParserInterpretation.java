package t;

/**
 * https://leetcode.com/problems/goal-parser-interpretation
 */
public class GoalParserInterpretation {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)","al");
    }
}
