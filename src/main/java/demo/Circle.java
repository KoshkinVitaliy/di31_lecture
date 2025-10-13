package demo;

public class Circle extends Shape{
    private int radius;
    private final Point point;

    public Circle(String color, int radius, Point point) {
        super(color);
        this.radius = radius;
        this.point = point;
    }

    @Override
    double calculateArea() {
        return AreaCalculator.PI * Math.pow(radius, 2);
    }
}
