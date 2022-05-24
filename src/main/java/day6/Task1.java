package day6;

import java.lang.module.ModuleReader;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearManufacture(2010);
        car.setYearManufacture(2020);
        car.info();
        System.out.println(car.yearDifference(2022));
        Motorbike motorbike = new Motorbike("Suzuki", "Black", 2010);
        motorbike.info();
        System.out.println(motorbike.yearDifference(2022));


    }
}
