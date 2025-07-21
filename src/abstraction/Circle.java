package abstraction;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super( "Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*radius*Math.PI;
    }
}
