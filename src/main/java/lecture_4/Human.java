package lecture_4;

public class Human extends Animal{

    public Human(int age, String family) {
        super(age, family);
    }

    @Override
    void swim() {
        System.out.println("Я плохо умею плавать");
    }

    @Override
    void run() {
        System.out.println("Я неплохо бегаю");
    }

    @Override
    void fly() {
        System.out.println("Я не умею летать :(");
    }
}
