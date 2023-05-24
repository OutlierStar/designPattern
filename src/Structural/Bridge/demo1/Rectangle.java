package Structural.Bridge.demo1;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Draw a rectangle with color ");
        color.paint();
    }
}
