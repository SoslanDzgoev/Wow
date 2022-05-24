package day6;

public class Car {
    private String model;
    private String color;
    private int yearManufacture = 0;

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

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public void info(){
        System.out.println("It is a Car");
    }
}
