package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int staminaRand = random.nextInt(80);
        Player player1 = new Player(staminaRand);
        Player player2 = new Player(staminaRand);
        Player player3 = new Player(staminaRand);
        Player.info();
        Player player4 = new Player(staminaRand);
        Player player5 = new Player(staminaRand);
        Player player6 = new Player(staminaRand);
        Player.info();
        Player player7 = new Player(staminaRand);
        Player.info();
        player1.run();
        Player.info();
    }
}
