package abstraction;

public class Main {
    public static void main(String[] args) {
        Shape circle= new Circle(3);
        Shape rectangle= new Rectangle(3, 3);

        System.out.println("Shape: " + circle.name);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("Shape: " + rectangle.name);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
