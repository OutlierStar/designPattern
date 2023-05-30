package Behavioral.Interpreter;

// 抽象表达式
interface Expression {
    boolean interpret(String context);
}

// 终结符表达式
class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {
        return context.contains(data);
    }
}

// 非终结符表达式
class OrExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}

// 使用示例
public class InterpreterPatternExample {
    public static void main(String[] args) {
        Expression expression1 = new TerminalExpression("Hello");
        Expression expression2 = new TerminalExpression("World");
        Expression orExpression = new OrExpression(expression1, expression2);

        // 示例1: 包含"Hello"的上下文
        String context1 = "Hello, everyone!";
        boolean result1 = orExpression.interpret(context1);
        System.out.println("Context1 Result: " + result1);
        // 输出：Context1 Result: true

        // 示例2: 不包含任何匹配的上下文
        String context2 = "Goodbye, World!";
        boolean result2 = orExpression.interpret(context2);
        System.out.println("Context2 Result: " + result2);
        // 输出：Context2 Result: false
    }
}

