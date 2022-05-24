package day4;
import java.util.Arrays;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        int [] array= new int[100];

        Random rand = new Random();

        for(int i = 0; i < array.length; i++)
            array [i] = rand.nextInt(10000) ;

        int min = 100000;
        int max = 0;
        int zero = 0;
        int sumZero = 0;

        for (int element : array){
            if (element > max){
                max = element;
            }
            if (element < min){
                min = element;
            }
            if (element % 10 == 0){
                zero++;
                sumZero += element;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max number : " + max);
        System.out.println("Min number : " + min);
        System.out.println("Колличество эллементов массива оканчивающихся на ноль : " + zero);
        System.out.println("Сумма элементов массива, оканчивающихся на ноль : " + sumZero);
    }
}
