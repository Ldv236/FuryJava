package ru.ldv236.football;

public class Player {
    private int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;

    static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) {
            countPlayers++;
        } else {
            System.out.println("игроков уже 6");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina == MIN_STAMINA) {
            System.out.println("игрок уже устал");
            return;
        }

        stamina--;

        if (stamina == MIN_STAMINA) {
            System.out.println("игрок выбыл");
            countPlayers--;
        }
    }

    static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " +
                    (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
