package ru.ldv236.OOP.footballExample;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(9);
        Player.info();
        Player player2 = new Player(9);
        Player.info();
        Player player3 = new Player(9);
        Player player4 = new Player(8);
        Player player5 = new Player(8);
        Player player6 = new Player(8);
        Player.info();
//
        Player player7 = new Player(100);//
        Player.info();

        Random random = new Random();
        for (int i = 0; i < 91; i++) {
            player1.run();
        }
        Player.info();
//        playFootBall();
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