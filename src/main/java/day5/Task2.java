package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Mini Cooper", "Black", 2020);
        System.out.println("Model:" + motorbike.getModel() + "\n" +
                "Color: " + motorbike.getColor() + "\n" +
                "Year: " + motorbike.getYearManufacture());
    }
}
