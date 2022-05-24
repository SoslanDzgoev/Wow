package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Made in Chine",2020, 20.6, 25_000_000);
        airplane.setYear(2015);
        airplane.setLength(30.5);
        airplane.fillUp(50);
        airplane.fillUp(22);
        airplane.info();
    }
}
