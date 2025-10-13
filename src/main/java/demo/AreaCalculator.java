package demo;

public class AreaCalculator {
    public static final double PI = 3.14159;

    public static void printTotalArea(Shape[] shapes) {
        double squareSum = 0;
        for (int index = 0; index < shapes.length; index++) {
            squareSum += shapes[index].calculateArea();
        }

        System.out.printf("Общая площадь всех фигур: %s", squareSum);
    }
}
