package ru.ldv236.OOP.footballExample;

public class Player {
    private int stamina;

    private final static int MAX_STAMINA = 10;
    private final static int MIN_STAMINA = 0;

    static int countPlayers = 0;

    public Player() {
        stamina = MAX_STAMINA;
    }

    private Player(int stamina) {
        this.stamina = stamina;
//        if (countPlayers < 6) {
//            countPlayers++;
//        } else {
//            System.out.println("игроков уже 6");
            // но бля, объект все равно создается же, получается надо
            // вызывать не конструктор напрямую, а транзитивно через метод с проверкой
//        }
    }

    static Player addPlayer(int stamina) {
        if (countPlayers < 6) {
            System.out.println("Player count - " + countPlayers + ", добавляем еще одного");
            countPlayers++;
            return new Player(stamina);
        }
        System.out.println("нельзя добавить еще игрока, их уже 6");
        return null;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
//        if (stamina == MIN_STAMINA) {
//            System.out.println("игрок уже устал");
//            return;
//        }
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
