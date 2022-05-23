package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        for (int i = number; i <number2; i++){
            if (i % 5 == 0 && !(i % 10 == 0) && !(i % 10 == 0)){
                System.out.println(i);
            }
        }
        if (number >= number2){
            System.out.println("Некоректный ввод");
        }
    }
}
