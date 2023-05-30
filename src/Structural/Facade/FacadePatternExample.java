package Structural.Facade;

// 子系统A
class SubsystemA {
    public void operationA() {
        System.out.println("Subsystem A operation");
    }
}

// 子系统B
class SubsystemB {
    public void operationB() {
        System.out.println("Subsystem B operation");
    }
}

// 子系统C
class SubsystemC {
    public void operationC() {
        System.out.println("Subsystem C operation");
    }
}

// 外观类
class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
        this.subsystemC = new SubsystemC();
    }

    public void operation() {
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}

// 使用示例
public class FacadePatternExample {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
        // 输出：
        // Subsystem A operation
        // Subsystem B operation
        // Subsystem C operation
    }
}

