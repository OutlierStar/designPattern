package Structural.Bridge.demo1;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Draw a circle with color ");
        color.paint();
    }
}



