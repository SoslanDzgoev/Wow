package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a < b) {
            a++;
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(" " + a);
            }
            if (a > b) {
                System.out.println("Error");
                break;
            }
        }
    }
}
