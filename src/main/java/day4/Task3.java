package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrice = new int[12][8];
        Random random = new Random();


        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = random.nextInt(50);
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < matrice.length; i++){
            int sum = 0;
            for (int j = 0; j < matrice[i].length; j++){
                sum = sum + matrice[i][j];
            }
            if (sum >= max){
                max = sum;
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}
