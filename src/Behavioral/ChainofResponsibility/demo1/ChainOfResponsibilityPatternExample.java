package Behavioral.ChainofResponsibility.demo1;

// 请求类
class Request {
    private String type;
    private String content;

    public Request(String type, String content) {
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }
}

// 抽象处理器类
abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}

// 具体处理器类A
class ConcreteHandlerA extends Handler {
    public void handleRequest(Request request) {
        if (request.getType().equals("TypeA")) {
            System.out.println("ConcreteHandlerA handles the request: " + request.getContent());
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

// 具体处理器类B
class ConcreteHandlerB extends Handler {
    public void handleRequest(Request request) {
        if (request.getType().equals("TypeB")) {
            System.out.println("ConcreteHandlerB handles the request: " + request.getContent());
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

// 具体处理器类C
class ConcreteHandlerC extends Handler {
    public void handleRequest(Request request) {
        if (request.getType().equals("TypeC")) {
            System.out.println("ConcreteHandlerC handles the request: " + request.getContent());
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

// 使用示例
public class ChainOfResponsibilityPatternExample {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        Request request1 = new Request("TypeA", "Request 1");
        handlerA.handleRequest(request1);

        Request request2 = new Request("TypeB", "Request 2");
        handlerA.handleRequest(request2);

        Request request3 = new Request("TypeC", "Request 3");
        handlerA.handleRequest(request3);
    }
}
