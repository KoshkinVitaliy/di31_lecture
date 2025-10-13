package lecture_4;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Human(10, "Гоминид");

        animal.swim();
        animal.fly();
        animal.run();
    }
}
