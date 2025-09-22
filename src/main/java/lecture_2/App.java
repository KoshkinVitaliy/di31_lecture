package lecture_2;

import java.util.Scanner;

public class App {

    public static void startApp() {
        System.out.println("1. Посмотреть все шкафы");
        System.out.println("2. Купить шкаф");
        System.out.println("3. Добавить шкаф");
        System.out.println("4. Выйти из программы");

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        getChoice(choice);
    }

    private static void getChoice(int choice) {
        System.exit(0);
    }
}
