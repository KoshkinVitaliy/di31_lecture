package lecture_2;

public class Closet {
    private String manufacturer;
    private String model;
    private float height;
    private float width;
    private float length;
    private double price;

    public Closet(String manufacturer,
                  String model,
                  float height,
                  float width,
                  float length,
                  double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.height = height;
        this.width = width;
        this.length = length;
        this.price = price;
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

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }
}
