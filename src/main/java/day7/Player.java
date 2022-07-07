package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers;


    public Player(int stamina) {
        this.stamina = stamina;
        if (stamina == 0) {
            countPlayers--;
        }

        if (stamina == 1) {
            countPlayers++;
        }

        if (countPlayers >= 6) {
            countPlayers--;
        }
        countPlayers++;

    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {

        if (stamina >= 1) {
            System.out.println(stamina -= 1);
        } else if (stamina == 0) {
            System.out.println(stamina);
        }

        countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
        //System.out.println(countPlayers);
    }
}
