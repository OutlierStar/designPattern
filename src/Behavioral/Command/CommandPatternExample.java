package Behavioral.Command;

// 命令接口
interface Command {
    void execute();
}

// 具体命令
class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }
}

// 接收者
class Receiver {
    public void action() {
        System.out.println("Receiver performing action");
    }
}

// 调用者
class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}

// 使用示例
public class CommandPatternExample {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
        // 输出：Receiver performing action
    }
}

