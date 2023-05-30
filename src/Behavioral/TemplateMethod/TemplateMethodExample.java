package Behavioral.TemplateMethod;

// 抽象类AbstractClass
abstract class AbstractClass {
    public void templateMethod() {
        primitiveOperation1();
        concreteOperation();
        if (hook()) {
            primitiveOperation2();
        }
    }
 
    // 基本方法1
    protected abstract void primitiveOperation1();
 
    // 基本方法2
    protected abstract void primitiveOperation2();
 
    // 具体方法
    private void concreteOperation() {
        System.out.println("这是一个具体方法");
    }
 
    // 钩子方法
    protected boolean hook() {
        return true;
    }
}
 
// 具体类ConcreteClassA
class ConcreteClassA extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("具体类A中的方法1实现");
    }
 
    @Override
    protected void primitiveOperation2() {
        System.out.println("具体类A中的方法2实现");
    }
}
 
// 具体类ConcreteClassB
class ConcreteClassB extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("具体类B中的方法1实现");
    }
 
    @Override
    protected void primitiveOperation2() {
        System.out.println("具体类B中的方法2实现");
    }
 
    @Override
    protected boolean hook() {
        return false;
    }
}
public class TemplateMethodExample {
    public static void main(String[] args) {
        AbstractClass a = new ConcreteClassA();
        a.templateMethod();
 
        System.out.println("=======================");
 
        AbstractClass b = new ConcreteClassB();
        b.templateMethod();
    }
}

