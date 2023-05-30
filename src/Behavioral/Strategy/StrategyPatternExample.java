package Behavioral.Strategy;

// 策略接口
interface Strategy {
    void execute();
}

// 具体策略类
class ConcreteStrategyA implements Strategy {
    public void execute() {
        System.out.println("Executing strategy A.");
    }
}

// 具体策略类
class ConcreteStrategyB implements Strategy {
    public void execute() {
        System.out.println("Executing strategy B.");
    }
}

// 上下文类
class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}

// 使用示例
public class StrategyPatternExample {
    public static void main(String[] args) {
        Context context = new Context();

        // 设置策略为 StrategyA
        Strategy strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);

        // 执行策略，由 StrategyA 处理
        context.executeStrategy();
        // 输出：Executing strategy A.

        // 切换到 StrategyB
        Strategy strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyB);

        // 执行策略，由 StrategyB 处理
        context.executeStrategy();
        // 输出：Executing strategy B.
    }
}

