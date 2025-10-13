package lecture_4;

public interface Swimmable {
    int CONST_A = 3;

    default void swim() {
        System.out.println(
                "Я не умею плавать :(");
        test();
    }

    private void test() {
        System.out.println("Это пример " +
                "приватного метода в интерфейсе");
    }
}
