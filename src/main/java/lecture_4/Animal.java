package lecture_4;

public abstract class Animal {
    int age;
    String family;

    public Animal(int age, String family) {
        this.age = age;
        this.family = family;
    }

    abstract void swim();
    abstract void run();
     void fly() {
         System.out.println();
    }
}
