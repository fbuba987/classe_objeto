package games;

import games.model.Games;

public class TestaGames {
    public static void main(String[] args) {
        Games g1 = new Games(123, "Pummel Party", 2019, "PC e PS4", 30.0f);
        Games g2 = new Games(456, "Elden Ring", 2022, "PC e PS4", 224.9f);

        g1.visualizar();
        g2.visualizar();
    }
}
