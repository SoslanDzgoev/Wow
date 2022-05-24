package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private int weight;
    private int fuel = 0;

    public static void compareAirplanes (Airplane airplane1, Airplane airplane2){
        if (airplane1.length < airplane2.length){
            System.out.println("Данный самолет длинее :"+ airplane1);
        } else if (airplane1.length > airplane2.length){
            System.out.println("Данный самолет длинее :"+ airplane2);
        }else {
            System.out.println("Длинна самолетов равна");
        }
    }

    public void fillUp (int fill){
        fuel = fill + fuel;
    }

    public Airplane(String manufacturer, int year, double length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    public void info (){
        System.out.println("Изготовитель:" + manufacturer +
                ", год выпуска:" + year + ", длина:" + length +
                ", вес:" + weight + ", количество топлива в баке:" + fuel);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public double getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                ", fuel=" + fuel +
                '}';
    }
}
