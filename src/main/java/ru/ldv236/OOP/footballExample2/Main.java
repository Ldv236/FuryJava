package ru.ldv236.OOP.footballExample2;


import java.util.Random;

public class Main {

    static Random rand = new Random();

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.getPlayers());

        game.addPlayer("Ursus");
        game.addPlayer("Afeev");
        game.addPlayer("Mercury");
        System.out.println(game.getPlayers());

        game.addPlayer("Piter");
        game.addPlayer("Snow");
        Player lev = new Player("Lev", game);
        game.addPlayer("Lev");

        game.removePlayer(lev);
        game.removePlayerByName("Snow");

        game.addPlayer("Small");
        System.out.println(game.getPlayers());


//        int count = 0;
//        for (int i = 0; i < 50; i++) {
//            count = game.getPlayers().size();
//            if (count > 0) {
//                game.getPlayer(rand.nextInt(count)).run();
//            } else {
//                System.out.println("все устали, нет игроков");
//            }
//        }

//        game.info();
//        game.addPlayer("Fred");
//        game.addPlayer("Vaganych");
//        game.addPlayer("Misha");
//        game.info();

//        for (int i = 0; i < 50; i++) {
//            count = game.getPlayers().size();
//            if (count > 0) {
//                game.getPlayer(rand.nextInt(count)).run();
//            } else {
//                System.out.println("все устали, нет игроков");
//            }
//        }
//        game.info();
    }
}
