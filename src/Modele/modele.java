package Modele;

public class modele {

    // Variables
    private int manche = 0; // Compteur du nombre de tour de la partie
    int column; // Colonne du plateau
    int hauteur = 0; // Compte la hauteur de la colonne de pion
    public Board board = new Board(); // Initialisation du plateau
    Player player1 = new Player("Joueur1");
    Player player2 = new Player("Joueur2");
    int i = 0; // Variable d'incrémentation
    int ii = 0; // Variable d'incrémentation
    int pawn1, pawn2, pawn3, pawn4; // Pions pour vérifier s'il y un puissance 4
    boolean pl1_win = false; // Pour dire que joueur1 a gagné
    boolean pl2_win = false; // Pour dire que joueur2 a gagné

    public modele() {

    }

    public void addPawn(int column) {

        // On vérifie la hauteur de la colonne
        hauteur = 6;

        do {

            hauteur--;

        } while (board.board[column][hauteur] == 1 || board.board[column][hauteur] == 2);

        if( manche % 2 == 0) {
            this.board.board[column][hauteur] = 1;
        }
        else {
            this.board.board[column][hauteur] = 2;
        }
    }

    public void showBoard() {

        // On affiche le plateau
        for (i = 0; i < 6; i++) {
            System.out.println("");
            for (ii = 0; ii < 7; ii++) {
                System.out.print("|");
                System.out.print(board.board[ii][i]);
            }
            System.out.print("|");
        }
    }


    // Getter
    public int[][] getBoard() {
        return board.board;
    }

    public int getManche() {
        return manche;
    }

    // Setter
    public void setManche() {
        this.manche++;
    }
}
