package Behavioral.Interpreter;

public class InterpreterDemo {
    public static Expression buildInterpreterTree() {
        Expression lionsExpression = new TerminalExpression("Lions");
        Expression tigersExpression = new TerminalExpression("Tigers");
        Expression bearsExpression = new TerminalExpression("Bears");

        Expression lionsOrTigersExpression = new OrExpression(lionsExpression, tigersExpression);
        Expression compoundExpression = new AndExpression(lionsOrTigersExpression, bearsExpression);

        return compoundExpression;
    }

    public static void main(String[] args) {
        String context = "Lions Bears";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }
}
