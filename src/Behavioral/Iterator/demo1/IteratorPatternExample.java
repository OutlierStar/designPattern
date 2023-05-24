package Behavioral.Iterator.demo1;

// 使用示例
public class IteratorPatternExample {
    public static void main(String[] args) {
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

        Container container = new ConcreteContainer(items);
        Iterator iterator = container.createIterator();

        while (iterator.hasNext()) {
            Object item = iterator.next();
            System.out.println(item);
        }
    }
}
