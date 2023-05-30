package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

// 中介者接口
interface Mediator {
    void sendMessage(String message, Colleague colleague);
}

// 具体中介者
class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void sendMessage(String message, Colleague colleague) {
        for (Colleague c : colleagues) {
            if (c != colleague) {
                c.receiveMessage(message);
            }
        }
    }
}

// 抽象同事类
abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void receiveMessage(String message);
}

// 具体同事类
class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println("ConcreteColleague1 received message: " + message);
    }
}

// 具体同事类
class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println("ConcreteColleague2 received message: " + message);
    }
}

// 使用示例
public class MediatorPatternExample {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);

        colleague1.send("Hello from ConcreteColleague1!");
        // 输出：ConcreteColleague2 received message: Hello from ConcreteColleague1!

        colleague2.send("Hi from ConcreteColleague2!");
        // 输出：ConcreteColleague1 received message: Hi from ConcreteColleague2!
    }
}

