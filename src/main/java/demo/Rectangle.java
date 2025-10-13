package demo;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this. height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}
