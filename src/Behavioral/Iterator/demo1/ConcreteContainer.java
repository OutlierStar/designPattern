package Behavioral.Iterator.demo1;

// 具体集合实现类
public class ConcreteContainer implements Container {
    private String[] items;

    public ConcreteContainer(String[] items) {
        this.items = items;
    }

    public Iterator createIterator() {
        return new ConcreteIterator(items);
    }
}
