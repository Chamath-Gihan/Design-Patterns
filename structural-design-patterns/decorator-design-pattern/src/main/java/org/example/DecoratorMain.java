package org.example;

public class DecoratorMain {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle : normal border");
        circle.draw();
        System.out.println("Circle : Red border");
        redCircle.draw();
        System.out.println("Rectangle : Red border");
        redRectangle.draw();

    }
}