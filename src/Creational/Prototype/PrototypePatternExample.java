package Creational.Prototype;

// 原型接口
interface Prototype {
    Prototype clone();
}

// 具体原型类
class ConcretePrototype implements Prototype {
    private String property;

    public ConcretePrototype(String property) {
        this.property = property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    public Prototype clone() {
        return new ConcretePrototype(property);
    }
}

// 使用示例
public class PrototypePatternExample {
    public static void main(String[] args) {
        // 创建原型对象
        ConcretePrototype prototype = new ConcretePrototype("Prototype");

        // 克隆原型对象
        ConcretePrototype clone1 = (ConcretePrototype) prototype.clone();
        System.out.println(clone1.getProperty()); // 输出：Prototype

        // 修改克隆对象的属性
        clone1.setProperty("Clone 1");
        System.out.println(clone1.getProperty()); // 输出：Clone 1

        // 再次克隆原型对象
        ConcretePrototype clone2 = (ConcretePrototype) prototype.clone();
        System.out.println(clone2.getProperty()); // 输出：Prototype
    }
}

