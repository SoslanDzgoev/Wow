package day6;

public class Motorbike {
    private final String model;
    private final String color;
    private final int yearManufacture;

    public Motorbike(String model, String color, int yearManufacture) {
        this.model = model;
        this.color = color;
        this.yearManufacture = yearManufacture;
    }

    public int yearDifference(int inputYear){
        if (inputYear < yearManufacture) {
            inputYear = yearManufacture - inputYear;
        }
        if (inputYear > yearManufacture) {
            inputYear = inputYear - yearManufacture;
        }
        return inputYear;
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

    public void info(){
        System.out.println("It is a Motorbike");
    }
}
