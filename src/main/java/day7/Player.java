package day7;

public class Player {
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private int stamina;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public void run() {
        stamina--;
        stamina = Math.abs(stamina);
        if (stamina < 1) {
            countPlayers = countPlayers - 1;
        }
    }

    public static void info() {

        String infoPlayers = "";
        switch (countPlayers) {
            case 6:
                infoPlayers = "На поле нет свободных мест";
                break;
            case 5:
                infoPlayers = "Команды неполные. На поле еще есть 1 свободное место";
                break;
            case 4:
                infoPlayers = "Команды неполные. На поле еще есть 2 свободных места";
                break;
            case 3:
                infoPlayers = "Команды неполные. На поле еще есть 3 свободных места";
                break;
            case 2:
                infoPlayers = "Команды неполные. На поле еще есть 4 свободных места";
                break;
            case 1:
                infoPlayers = "Команды неполные. На поле еще есть 5 свободных мест";
                break;
        }
        System.out.println(infoPlayers);
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    @Override
    public String toString() {
        return "Player{" +
                "stamina=" + stamina +
                '}';
    }
}
