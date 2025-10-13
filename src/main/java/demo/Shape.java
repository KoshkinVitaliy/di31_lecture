package demo;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();

    public void displayInfo() {
        System.out.printf("Цвет фигуры: %s", color);
    }
}
