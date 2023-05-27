package Creational.FactoryMethod.demo1;

// 定义产品接口
interface Product {
    void operation();
}

// 具体产品类A
class ConcreteProductA implements Product {
    public void operation() {
        System.out.println("ConcreteProductA operation");
    }
}

// 具体产品类B
class ConcreteProductB implements Product {
    public void operation() {
        System.out.println("ConcreteProductB operation");
    }
}

// 定义工厂接口
interface Factory {
    Product createProduct();
}

// 具体工厂类A
class ConcreteFactoryA implements Factory {
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

// 具体工厂类B
class ConcreteFactoryB implements Factory {
    public Product createProduct() {
        return new ConcreteProductB();
    }
}

// 使用示例
public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createProduct();
        productA.operation();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.createProduct();
        productB.operation();
    }
}
