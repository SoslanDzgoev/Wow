package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            if (number1 == 0 && number2 == 0){
                break;
            }
            System.out.println(number1 / number2);

        }
    }
}
