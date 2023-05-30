package Creational.Builder;

// 产品类
class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        System.out.println("Product parts: " + partA + ", " + partB + ", " + partC);
    }
}

// 抽象建造者
interface Builder {
    void buildPartA();
    void buildPartB();
    void buildPartC();
    Product getResult();
}

// 具体建造者1
class ConcreteBuilder1 implements Builder {
    private Product product;

    public ConcreteBuilder1() {
        this.product = new Product();
    }

    public void buildPartA() {
        product.setPartA("Part A1");
    }

    public void buildPartB() {
        product.setPartB("Part B1");
    }

    public void buildPartC() {
        product.setPartC("Part C1");
    }

    public Product getResult() {
        return product;
    }
}

// 具体建造者2
class ConcreteBuilder2 implements Builder {
    private Product product;

    public ConcreteBuilder2() {
        this.product = new Product();
    }

    public void buildPartA() {
        product.setPartA("Part A2");
    }

    public void buildPartB() {
        product.setPartB("Part B2");
    }

    public void buildPartC() {
        product.setPartC("Part C2");
    }

    public Product getResult() {
        return product;
    }
}

// 指挥者
class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}

// 使用示例
public class BuilderPatternExample {
    public static void main(String[] args) {
        Director director = new Director();

        Builder builder1 = new ConcreteBuilder1();
        director.construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();
        // 输出：Product parts: Part A1, Part B1, Part C1

        Builder builder2 = new ConcreteBuilder2();
        director.construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();
        // 输出：Product parts: Part A2, Part B2, Part C2
    }
}
