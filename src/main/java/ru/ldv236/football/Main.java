package ru.ldv236.football;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        Player player2 = new Player(92);
        Player player3 = new Player(94);
        Player player4 = new Player(96);
        Player player5 = new Player(98);
        Player player6 = new Player(100);

        Player.info();

        Player player7 = new Player(100);

        Player.info();

        for (int i = 0; i < 91; i++) {
            player1.run();
        }

        Player.info();
    }
}