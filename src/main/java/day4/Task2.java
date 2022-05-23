package day4;
import java.util.Arrays;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        int [] array= new int[20];
        Random rand = new Random();
        for(int i = 0; i < array.length; i++){
            array [i] = rand.nextInt(10000) ;
        }
        int min = array[0];
        int max = array[0];
        int zerro = 0;
        int sumZerro = 0;
        for (int i = 0; i < array.length; i++){
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
            if (array[i] % 10 == 0){
                zerro++;
                sumZerro += array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max number : " + max);
        System.out.println("Min number : " + min);
        System.out.println("Колличество эллементов массива оканчивающихся на ноль : " + zerro);
        System.out.println(sumZerro);
    }
}
