package Creational.FactoryMethod.demo1;

import java.util.Scanner;

// 定义产品接口
interface Product {
    void operation();
}

// 具体产品类A
class ConcreteProductA implements Product {
    public void operation() {
        System.out.println("Circle operation");
    }
}

// 具体产品类B
class ConcreteProductB implements Product {
    public void operation() {
        System.out.println("Rectangle operation");
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

        System.out.println("输入图形种类: 1 圆形 2 矩形");
        Scanner scanner=new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();
        Factory factory;
        Product product;
        if ( i == 1 ) {
            factory = new ConcreteFactoryA();
            
        }else{
            factory = new ConcreteFactoryB();
        }
        product = factory.createProduct();
        product.operation();
    }
}
