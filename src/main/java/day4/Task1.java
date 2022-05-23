package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int massiv = scanner.nextInt();
        double [] mas = new double[massiv];
        int col = 0;
        int equal1 =0;
        int shet = 0;
        int notshet= 0;
        double sum = 0;

        for (int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * (10 - 1) + 1);
        }
        for (int i = 0; i < mas.length; i++){
            if (mas[i] > 8) col++;
            if (mas[i] == 1) equal1++;
            if (mas[i] % 2 == 0) shet++;
            if (mas[i] % 2 != 0) notshet++;
            sum = sum + mas[i];
            System.out.print((int)mas[i]);
        }
        System.out.println();
        System.out.println("Длинна Массива : " + mas.length);
        System.out.println("Колличество чисел больше 8 : " + col);
        System.out.println("Колличество чисел равно 1 : " + equal1);
        System.out.println("Количество четных чисел : " + shet);
        System.out.println("Колличество нечетных чисел : " + notshet);
        System.out.println("Сумма всех эллементов массива : " + (int)sum);

    }
}
