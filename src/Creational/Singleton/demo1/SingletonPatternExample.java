package Creational.Singleton.demo1;

// 懒汉式单例模式（线程不安全）
class Singleton {
    private static Singleton instance;

    private Singleton() {
        // 私有构造函数
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton do something");
    }
}

// 线程安全的懒汉式单例模式（使用双重检查锁定）
class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        // 私有构造函数
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("ThreadSafeSingleton do something");
    }
}

// 饿汉式单例模式（线程安全）
class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // 私有构造函数
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("EagerSingleton do something");
    }
}

// 使用示例
public class SingletonPatternExample {
    public static void main(String[] args) {
        // 懒汉式单例模式
        Singleton singleton1 = Singleton.getInstance();
        singleton1.doSomething();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.doSomething();

        // 线程安全的懒汉式单例模式
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        threadSafeSingleton1.doSomething();

        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
        threadSafeSingleton2.doSomething();

        // 饿汉式单例模式
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        eagerSingleton1.doSomething();

        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        eagerSingleton2.doSomething();
    }
}

