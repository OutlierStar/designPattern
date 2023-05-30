package Behavioral.State;

// 状态接口
interface State {
    void handle();
}

// 具体状态类
class ConcreteStateA implements State {
    public void handle() {
        System.out.println("State A is handling.");
    }
}

// 具体状态类
class ConcreteStateB implements State {
    public void handle() {
        System.out.println("State B is handling.");
    }
}

// 上下文类
class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }
}

// 使用示例
public class StatePatternExample {
    public static void main(String[] args) {
        Context context = new Context();

        // 初始状态为 StateA
        State stateA = new ConcreteStateA();
        context.setState(stateA);

        // 执行请求，由 StateA 处理
        context.request();
        // 输出：State A is handling.

        // 切换到 StateB
        State stateB = new ConcreteStateB();
        context.setState(stateB);

        // 执行请求，由 StateB 处理
        context.request();
        // 输出：State B is handling.
    }
}

