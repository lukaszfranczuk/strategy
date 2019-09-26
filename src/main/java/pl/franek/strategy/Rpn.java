package pl.franek.strategy;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class Rpn {

    private static final String TOKEN_DELIMITER = " ";

    public String calculate(String expression) {
        String[] splitExpression = expression.split(TOKEN_DELIMITER);
        Deque<String> stack = new ArrayDeque<>();
        for (String token : splitExpression) {
            modifyStack(stack, token);
        }
        return stack.pop();
    }

    private void modifyStack(Deque<String> stack, String token) {
        if (StringUtils.isNumeric(token)) {
            stack.push(token);
        } else {
            String second = stack.pop();
            String first = stack.pop();
            stack.push(calculate(first, second, token));
        }
    }

    protected abstract String calculate(String firstToken, String secondToken, String operation);
}
