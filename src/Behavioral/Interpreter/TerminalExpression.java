package Behavioral.Interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        StringTokenizer stringTokenizer = new StringTokenizer(context);
        while(stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            if (token.equals(data)) {
                return true;
            }
        }

        return false;
    }
}
