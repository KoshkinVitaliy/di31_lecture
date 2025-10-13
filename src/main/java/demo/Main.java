package demo;

public class Main {
    public static void main(String[] args) {
        Shape circle =
                new Circle("Белый", 10, new Point(3,3));
        Shape rectangle = new Rectangle("Синий", 5, 10);

        Shape[] shapes = {circle, rectangle};

        AreaCalculator.printTotalArea(shapes);
        System.out.println();
        circle.displayInfo();
    }
}
