package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Germany",2010,41.5, 4000000);
        Airplane airplane2 = new Airplane("Germany",2011,40.5, 4000000);
        Airplane.compareAirplanes(airplane1,airplane2);

    }
}