package lecture_4;

public class Duck extends Animal {
    public Duck(int age, String family) {
        super(age, family);
    }

    @Override
    void swim() {
        System.out.println("Я умею плавать!");
    }

    @Override
    void run() {
        System.out.println("Я умею бегать!");
    }

    @Override
    void fly() {
        System.out.println("Я умею летать!");
    }
}
