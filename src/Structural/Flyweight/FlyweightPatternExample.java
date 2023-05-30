package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

// 享元工厂
class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
            return flyweight;
        }
    }
}

// 抽象享元
interface Flyweight {
    void operation();
}

// 具体享元
class ConcreteFlyweight implements Flyweight {
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
    }

    public void operation() {
        System.out.println("ConcreteFlyweight with key " + key + " operation");
    }
}

// 使用示例
public class FlyweightPatternExample {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight flyweight1 = flyweightFactory.getFlyweight("key1");
        flyweight1.operation();
        // 输出：ConcreteFlyweight with key key1 operation

        Flyweight flyweight2 = flyweightFactory.getFlyweight("key2");
        flyweight2.operation();
        // 输出：ConcreteFlyweight with key key2 operation

        Flyweight flyweight3 = flyweightFactory.getFlyweight("key1");
        flyweight3.operation();
        // 输出：ConcreteFlyweight with key key1 operation

        System.out.println(flyweight1 == flyweight3); // 输出：true
    }
}

