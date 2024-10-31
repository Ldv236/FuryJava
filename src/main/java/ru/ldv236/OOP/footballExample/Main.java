package ru.ldv236.OOP.footballExample;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Player player1 = Player.addPlayer(9);
        Player player2 = Player.addPlayer(9);
        Player player3 = Player.addPlayer(9);
        Player player4 = Player.addPlayer(9);
        Player player5 = Player.addPlayer(9);
        Player player6 = Player.addPlayer(9);
        Player player7 = Player.addPlayer(9);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            player1.run();
            player2.run();
        }
        Player.info();

        Player player8 = Player.addPlayer(9);
        Player player9 = Player.addPlayer(9);
        Player player10 = Player.addPlayer(9);
    }

//    static void playFootBall() {
//        Player[] game = new Player[10];
//        game[0] = Player.addPlayer(9);
//        game[1] = Player.addPlayer(9);
//        game[2] = Player.addPlayer(9);
//        game[3] = Player.addPlayer(9);
//        game[4] = Player.addPlayer(9);
//        game[5] = Player.addPlayer(9);
//
//        game[6] = Player.addPlayer(9);
//        Player.info();
//
//    }
}