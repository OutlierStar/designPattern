package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

// 主题接口
interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

// 具体主题
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}

// 观察者接口
interface Observer {
    void update(String state);
}

// 具体观察者
class ConcreteObserver implements Observer {
    private String observerState;

    public void update(String state) {
        observerState = state;
        System.out.println("Observer State: " + observerState);
    }
}

// 使用示例
public class ObserverPatternExample {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setState("State 1");
        // 输出：
        // Observer State: State 1
        // Observer State: State 1

        subject.setState("State 2");
        // 输出：
        // Observer State: State 2
        // Observer State: State 2

        subject.removeObserver(observer2);

        subject.setState("State 3");
        // 输出：
        // Observer State: State 3
    }
}

