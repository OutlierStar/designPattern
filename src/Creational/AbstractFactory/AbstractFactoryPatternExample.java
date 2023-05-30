package Creational.AbstractFactory;

// 抽象产品A
interface ProductA {
    void operationA();
}

// 具体产品A1
class ConcreteProductA1 implements ProductA {
    public void operationA() {
        System.out.println("ConcreteProductA1 operationA");
    }
}

// 具体产品A2
class ConcreteProductA2 implements ProductA {
    public void operationA() {
        System.out.println("ConcreteProductA2 operationA");
    }
}

// 抽象产品B
interface ProductB {
    void operationB();
}

// 具体产品B1
class ConcreteProductB1 implements ProductB {
    public void operationB() {
        System.out.println("ConcreteProductB1 operationB");
    }
}

// 具体产品B2
class ConcreteProductB2 implements ProductB {
    public void operationB() {
        System.out.println("ConcreteProductB2 operationB");
    }
}

// 抽象工厂
interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

// 具体工厂1
class ConcreteFactory1 implements AbstractFactory {
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

// 具体工厂2
class ConcreteFactory2 implements AbstractFactory {
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

// 使用示例
public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.operationA(); // 输出：ConcreteProductA1 operationA
        productB1.operationB(); // 输出：ConcreteProductB1 operationB

        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.operationA(); // 输出：ConcreteProductA2 operationA
        productB2.operationB(); // 输出：ConcreteProductB2 operationB
    }
}

