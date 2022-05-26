package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        long b = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            s.append(i).append(" ");
        }
        long a = System.currentTimeMillis();
        System.out.println("Стринг :" + (a - b));


        StringBuilder stringBuilder = new StringBuilder();
        b = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }
        a = System.currentTimeMillis();
        System.out.println("СтрингБилдер :" + (a - b));


    }

}
