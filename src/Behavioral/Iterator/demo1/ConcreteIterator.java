package Behavioral.Iterator.demo1;

// 具体迭代器实现类
public class ConcreteIterator implements Iterator {
    private String[] items;
    private int position = 0;

    public ConcreteIterator(String[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.length;
    }

    public Object next() {
        if (this.hasNext()) {
            return items[position++];
        }
        return null;
    }
}
