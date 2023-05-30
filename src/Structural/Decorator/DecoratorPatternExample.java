package Structural.Decorator;

// 抽象组件
interface Component {
    void operation();
}

// 具体组件
class ConcreteComponent implements Component {
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }
}

// 抽象装饰器
abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}

// 具体装饰器A
class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        additionalOperation();
    }

    public void additionalOperation() {
        System.out.println("ConcreteDecoratorA additional operation");
    }
}

// 具体装饰器B
class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        additionalOperation();
    }

    public void additionalOperation() {
        System.out.println("ConcreteDecoratorB additional operation");
    }
}

// 使用示例
public class DecoratorPatternExample {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        // 输出：ConcreteComponent operation

        Component decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();
        // 输出：
        // ConcreteComponent operation
        // ConcreteDecoratorA additional operation

        Component decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operation();
        // 输出：
        // ConcreteComponent operation
        // ConcreteDecoratorB additional operation

        Component decoratorAB = new ConcreteDecoratorB(new ConcreteDecoratorA(component));
        decoratorAB.operation();
        // 输出：
        // ConcreteComponent operation
        // ConcreteDecoratorA additional operation
        // ConcreteDecoratorB additional operation
    }
}

