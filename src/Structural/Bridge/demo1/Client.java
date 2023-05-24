package Structural.Bridge.demo1;

public class Client {
    public static void main(String[] args) {
        Color red = new Red();
        Shape circle = new Circle(red);
        circle.draw();

        Color blue = new Blue();
        Shape rectangle = new Rectangle(blue);
        rectangle.draw();
    }
}

