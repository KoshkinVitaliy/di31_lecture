package lecture_3;

public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String manufacturer,
                       String model,
                       double price,
                       double batteryCapacity) {
        super(manufacturer, model, price);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Запущен электрический двигатель.");
    }
}
