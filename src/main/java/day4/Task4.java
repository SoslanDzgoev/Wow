package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);
        int max = 0;
        int maxInd = 0;

        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum = sum + array[j];
            }
            if (sum > max) {
                max = sum;
                maxInd = i;

            }
        }
        System.out.println(maxInd);
    }
}
