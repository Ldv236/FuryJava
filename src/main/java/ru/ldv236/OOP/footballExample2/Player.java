package ru.ldv236.OOP.footballExample2;

import java.util.Objects;
import java.util.Random;

public class Player {
    private static final int MIN_STAMINA = 0;
    private static final int MAX_STAMINA = 10;
    Random rand = new Random();

    private String name;
    private Game game;
    private Integer stamina;


    public Player(String name, Game game) {
        this.name = name;
        this.game = game;
        this.stamina = rand.nextInt(8, MAX_STAMINA + 1);
    }

    public String getName() {
        return name;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            System.out.println(this + " побежал, выносливость - " + stamina);
        }
        if (stamina == MIN_STAMINA) {
            game.removePlayer(this);
            System.out.println(this + " устал и ушел с поля");
        }
    }

    @Override
    public String toString() {
        return "Player{" + name + ", " + stamina + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
