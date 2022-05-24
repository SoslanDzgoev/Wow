package day5;

public class Motorbike {
    private final String model;
    private final String color;
    private final int yearManufacture;

    public Motorbike(String model, String color, int yearManufacture) {
        this.model = model;
        this.color = color;
        this.yearManufacture = yearManufacture;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }
}
