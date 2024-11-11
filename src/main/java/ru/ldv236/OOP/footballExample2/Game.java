package ru.ldv236.OOP.footballExample2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {
    private static final int MAX_COUNT = 6;

    private List<Player> players = new ArrayList<>();
    private Player currentPlayer;

    public void addPlayer(String name) {
        if (players.size() < MAX_COUNT) {
            Player newPlayer = new Player(name, this);
            players.add(newPlayer);
            System.out.println("Введен новый игрок, всего - " + players.size());
        } else {
            System.out.println("Игроков уже 6, больше мест нет");
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void removePlayer(Player player) {
        if (players.remove(player)) {
            System.out.println(player + " removed");
        } else {
            System.out.println(player + " does not exists in this game");
        }
    }

    public void removePlayerByName(String name) {
        // норм, но стремно использовать такой цикл для этой задачи
//        for (int i = 0; i < players.size(); i++) {
//            if (players.get(i).getName().equals(name)) {
//                removePlayer(players.get(i));
//            }
//        }

        // а так эксепшен - в обоих вариантах
//        for (Player player : players) {
//            if (player.getName().equals(name)) {
////                removePlayer(player);
//                players.remove(player);
//            }
//        }

        // работает, но как-то громоздко и не используем стандартный метод удаления
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.getName().equals(name)) {
                iterator.remove();
//                removePlayer(player);
                System.out.println(player + " removed");
            }
        }

//         работает, но не получаем самого игрока и не используем стандартный метод удаления, как в прошлых вариантах
        boolean playerRemoved = players.removeIf(player -> player.getName().equals(name));
        if (playerRemoved) {
            System.out.println(name + " removed");
        } else {
            System.out.println(name + " does not exists in this game");
        }
    }

    public Player getPlayer(int index) {
        return players.get(index);
    }

    public void info() {
        if (players.size() < MAX_COUNT) {
            System.out.println("Еще есть " + (MAX_COUNT - players.size()) + " свободных мест на поле");
        } else {
            System.out.println("На поле нет сводобных мест");
        }
    }
}
