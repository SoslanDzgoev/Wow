package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLenght = scanner.nextInt();
        int[] array = new int[arrayLenght];
        int more8 = 0;
        int equal1 = 0;
        int evenNumber = 0;
        int oddNumber = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (10));
            if (array[i] > 8) more8++;
            if (array[i] == 1) equal1++;
            if (array[i] % 2 == 0) evenNumber++;
            if (array[i] % 2 != 0) oddNumber++;
            sum = sum + array[i];
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
        System.out.println("Длинна Массива : " + array.length);
        System.out.println("Колличество чисел больше 8 : " + more8);
        System.out.println("Колличество чисел равно 1 : " + equal1);
        System.out.println("Количество четных чисел : " + evenNumber);
        System.out.println("Колличество нечетных чисел : " + oddNumber);
        System.out.println("Сумма всех эллементов массива : " + sum);

    }
}
