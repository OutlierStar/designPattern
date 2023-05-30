package Behavioral.Memento;

// 备忘录类
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

// 发起人类
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}

// 管理者类
class Caretaker {
    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}

// 使用示例
public class MementoPatternExample {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // 设置初始状态
        originator.setState("State 1");

        // 创建备忘录并保存状态
        Memento memento = originator.createMemento();
        caretaker.setMemento(memento);

        // 修改状态
        originator.setState("State 2");

        // 恢复到备忘录保存的状态
        Memento savedMemento = caretaker.getMemento();
        originator.restoreMemento(savedMemento);

        System.out.println("Current State: " + originator.getState());
        // 输出：Current State: State 1
    }
}

