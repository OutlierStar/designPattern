package Structural.Proxy;

// 主题接口
interface Subject {
    void request();
}

// 真实主题
class RealSubject implements Subject {
    public void request() {
        System.out.println("RealSubject handling request");
    }
}

// 代理类
class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    public void request() {
        // 在调用真实主题之前可以执行一些额外的操作
        System.out.println("Proxy handling request before");
        
        realSubject.request();
        
        // 在调用真实主题之后可以执行一些额外的操作
        System.out.println("Proxy handling request after");
    }
}

// 使用示例
public class ProxyPatternExample {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
        // 输出：
        // Proxy handling request before
        // RealSubject handling request
        // Proxy handling request after
    }
}

