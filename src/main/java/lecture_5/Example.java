package lecture_5;

public class Example {
    public static void exampleMethod(int a, int b) {
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException ex) {
            System.out.println("Атата, делить на ноль нехорошо!");
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Завершаю работу метода!");
        }
    }
}
