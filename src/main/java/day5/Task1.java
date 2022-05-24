package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Mini Cooper");
        car.setColor("Red");
        car.setYearManufacture(2020);
        System.out.println("Model:" + car.getModel() + "\n" + "Color: " + car.getColor() + "\n" + "Year: " + car.getYearManufacture());

    }
}
