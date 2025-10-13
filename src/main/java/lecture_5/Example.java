package lecture_5;

public class Example {
    public static void exampleMethod(int a, int b) {
        try {
            System.out.println(a / b);
        }
        catch (Exception exception) {
            System.out.println("Атата, делить на ноль нехорошо!");
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("Завершаю работу метода!");
        }
    }
}
