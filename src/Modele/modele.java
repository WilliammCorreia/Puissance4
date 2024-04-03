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
    private boolean pl1_win = false; // Pour dire que joueur1 a gagné
    private boolean pl2_win = false; // Pour dire que joueur2 a gagné


    public modele() {

    }

    // Ajouter un pion dans la matrice
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

    // Affiche la matrice
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

    // Vérifier s'il y a un puissance 4
    public void verifWin(int[][] matrice) {

        // Vérification si le joueur à 4 pions alignés horizontalement
        for (i = 0; i < 6; i++) {
            for (ii = 0; ii < 4; ii++) {

                pawn1 = board.board[ii][i];
                pawn2 = board.board[(ii + 1)][i];
                pawn3 = board.board[(ii + 2)][i];
                pawn4 = board.board[(ii + 3)][i];

                if (pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {

                    if ( manche % 2 == 0) {
                        pl1_win = true;
                    }
                    else {
                        pl2_win = true;
                    }

                }
            }
        }

        // Vérification si le joueur à 4 pions alignés verticalement
        for (i = 0; i < 3; i++) {
            for (ii = 0; ii < 7; ii++) {

                pawn1 = board.board[ii][i];
                pawn2 = board.board[ii][(i + 1)];
                pawn3 = board.board[ii][(i + 2)];
                pawn4 = board.board[ii][(i + 3)];

                if (pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {

                    if ( manche % 2 == 0) {
                        pl1_win = true;
                    }
                    else {
                        pl2_win = true;
                    }

                }
            }
        }

        // Vérification si le joueur à 4 pions alignés en diagonale "\"
        for (i = 0; i < 3; i++) {
            for (ii = 0; ii < 4; ii++) {

                pawn1 = board.board[ii][i];
                pawn2 = board.board[(ii + 1)][(i + 1)];
                pawn3 = board.board[(ii + 2)][(i + 2)];
                pawn4 = board.board[(ii + 3)][(i + 3)];

                if (pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {

                    if ( manche % 2 == 0) {
                        pl1_win = true;
                    }
                    else {
                        pl2_win = true;
                    }

                }
            }
        }

        // Vérification si le joueur à 4 pions alignés en diagonale "/"
        for (i = 5; i > 2; i--) {
            for (ii = 0; ii < 3; ii++) {

                pawn1 = board.board[ii][i];
                pawn2 = board.board[(ii + 1)][(i - 1)];
                pawn3 = board.board[(ii + 2)][(i - 2)];
                pawn4 = board.board[(ii + 3)][(i - 3)];

                if (pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {

                    if ( manche % 2 == 0) {
                        pl1_win = true;
                    }
                    else {
                        pl2_win = true;
                    }

                }
            }
        }

    }

    // Getter
    public int[][] getBoard() {
        return board.board;
    }

    public int getManche() {
        return manche;
    }

    public boolean isPl1_win() {
        return pl1_win;
    }

    public boolean isPl2_win() {
        return pl2_win;
    }

    // Setter
    public void setManche() {
        this.manche++;
    }
}
