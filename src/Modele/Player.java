package Modele;

import java.util.Scanner;

public class Player {

    private String name;
    private int pawn_nb = 21;
    Scanner scanner = new Scanner(System.in);

    Player(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public int getPawn_nb() {
        return this.pawn_nb;
    }

    // Setter
    public void setPawn_nb(int nb) {
        this.pawn_nb = nb;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methods
    public void play(int column) {

    }


}
