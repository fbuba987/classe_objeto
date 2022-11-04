package games;

import games.model.Console;
import games.model.Games;
import games.model.Jogo;

public class TestaGames {
    public static void main(String[] args) {
        Games g1 = new Games(123, "Pummel Party", 2019, "PC e PS4", 30.0f);
        Games g2 = new Games(456, "Elden Ring", 2022, "PC e PS4", 224.9f);

        Jogo j1 = new Jogo(123, "Multiversus", 2020, "PC E PS5", 150.0f, "Futebol" );
        Jogo j2 = new Jogo(234, "Overwatch 2", 2021, "PC E PS5", 150.0f, "Futebol" );

        Console c1 = new Console(345, "CompleteStore", 2018, "Sup Game Box Plus 400", 300.0f, "Xbox One X");
        Console c2 = new Console(456, "Fliper", 2017, "Fliperama", 799.0f, "Playstation 4 Pro");

        g1.visualizar();
        g2.visualizar();
        j1.visualizar();
        j2.visualizar();
        c1.visualizar();
        c1.visualizar();
    }
}
