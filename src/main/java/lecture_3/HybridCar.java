package lecture_3;

import java.util.Scanner;

public class HybridCar extends ElectricCar{
    private double enginePower;

    public HybridCar(String manufacturer,
                     String model,
                     double price,
                     double batteryCapacity,
                     double enginePower) {
        super(manufacturer, model, price, batteryCapacity);
        this.enginePower = enginePower;
    }

    @Override
    public void startEngine() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите тип двигателя: ");
        var choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Запущен двигатель ДВС.");
        }
        else System.out.println("Запущены электродвигатели.");
    }
}
