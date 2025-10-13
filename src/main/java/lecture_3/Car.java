package lecture_3;

public class Car {
    private String manufacturer;
    private String model;
    private double price;

    public Car(String manufacturer, String model, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен.");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
