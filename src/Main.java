import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables
        Scanner scanner = new Scanner(System.in);
        Board board = new Board(); // Initialisation du plateau
        String name; // Nom du joueur
        int column; // Colonne du plateau
        int hauteur = 0; // Compte la hauteur de la colonne de pion
        int i = 0; // Variable d'incrémentation
        int ii = 0; // Variable d'incrémentation
        int manche = 0; // Compteur du nombre de tour de la partie

        // Initialisation du joueur 1
        System.out.println("Entrer le nom du joueur 1 :");
        name = scanner.nextLine();
        Player player1 = new Player(name);

        // Initialisation du joueur 2
        System.out.println("Entrer le nom du joueur 2 :");
        name = scanner.nextLine();
        Player player2 = new Player(name);

        /** Début de la partie */
        do {
            manche++;

            if( manche % 2 == 0 ) {

                System.out.println("");
                System.out.println("***** "+ player1.getName() +" *****");
                System.out.println("Entrer la colonne où placer le pion :");
                column = scanner.nextInt();

                // On vérifie la hauteur de la colonne
                hauteur = 6;

                do {

                    hauteur--;

                } while( board.board[column][hauteur] == 1 || board.board[column][hauteur] == 2 );

                // On place le pion à la bonne hauteur, bonne ligne
                board.board[column][hauteur] = 1;
                player1.setPawn_nb(player1.getPawn_nb() - 1); // On retire un pion

                // On affiche le plateau
                for (i = 0; i < 6; i++) {
                    System.out.println("");
                    for (ii = 0; ii < 7; ii++) {
                        System.out.print("|");
                        System.out.print(board.board[ii][i]);
                    }
                    System.out.print("|");
                }

                System.out.println("");

            }
            else {

                System.out.println("");
                System.out.println("***** "+ player2.getName() +" *****");
                System.out.println("Entrer la colonne où placer le pion :");
                column = scanner.nextInt();

                // On vérifie la hauteur de la colonne
                hauteur = 6;

                do {

                    hauteur--;

                } while( board.board[column][hauteur] == 1 || board.board[column][hauteur] == 2 );

                // On place le pion à la bonne hauteur, bonne ligne
                board.board[column][hauteur] = 2;
                player2.setPawn_nb(player2.getPawn_nb() - 1); // On retire un pion

                // On affiche le plateau
                for (i = 0; i < 6; i++) {
                    System.out.println("");
                    for (ii = 0; ii < 7; ii++) {
                        System.out.print("|");
                        System.out.print(board.board[ii][i]);
                    }
                    System.out.print("|");
                }

                System.out.println("");

            }

        } while( manche != 42 || );


    }
}