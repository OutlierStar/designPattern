package Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

// 访问者接口
interface Visitor {
    void visit(ElementA elementA);

    void visit(ElementB elementB);
}

// 具体访问者A
class ConcreteVisitorA implements Visitor {
    public void visit(ElementA elementA) {
        System.out.println("Visitor A is visiting Element A.");
    }

    public void visit(ElementB elementB) {
        System.out.println("Visitor A is visiting Element B.");
    }
}

// 具体访问者B
class ConcreteVisitorB implements Visitor {
    public void visit(ElementA elementA) {
        System.out.println("Visitor B is visiting Element A.");
    }

    public void visit(ElementB elementB) {
        System.out.println("Visitor B is visiting Element B.");
    }
}

// 元素接口
interface Element {
    void accept(Visitor visitor);
}

// 具体元素A
class ElementA implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

// 具体元素B
class ElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

// 对象结构
class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}

// 使用示例
public class VisitorPatternExample {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        // 添加元素到对象结构中
        Element elementA = new ElementA();
        Element elementB = new ElementB();
        objectStructure.addElement(elementA);
        objectStructure.addElement(elementB);

        // 创建具体访问者
        Visitor visitorA = new ConcreteVisitorA();
        Visitor visitorB = new ConcreteVisitorB();

        // 对象结构接受访问者A，访问者A访问元素A和元素B
        objectStructure.accept(visitorA);
        // 输出：
        // Visitor A is visiting Element A.
        // Visitor A is visiting Element B.

        // 对象结构接受访问者B，访问者B访问元素A和元素B
        objectStructure.accept(visitorB);
        // 输出：
        // Visitor B is visiting Element A.
        // Visitor B is visiting Element B.
    }
}

