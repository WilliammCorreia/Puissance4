import View.view;
import Controller.controller;
import Modele.modele;

public class Main {
    public static void main(String[] args) {

        view v = new view();
        modele m = new modele();
        controller c = new controller(v,m);

        // Variables
        int manche = 0; // Compteur du nombre de tour de la partie
        int column; // Colonne du plateau
        int hauteur = 0; // Compte la hauteur de la colonne de pion
        Board board = new Board(); // Initialisation du plateau
        Player player1 = new Player("Joueur1");
        Player player2 = new Player("Joueur2");
        int i = 0; // Variable d'incrémentation
        int ii = 0; // Variable d'incrémentation
        int pawn1, pawn2, pawn3, pawn4; // Pions pour vérifier s'il y un puissance 4
        boolean pl1_win = false; // Pour dire que joueur1 a gagné
        boolean pl2_win = false; // Pour dire que joueur2 a gagné


        do {
            manche++; // On incrémente le compteur de manche

            System.out.println("Manche : "+ manche);

            if( manche % 2 == 0 ) {

                column = c.getColumn();

                // On vérifie la hauteur de la colonne
                hauteur = 6;

                do {

                    hauteur--;

                } while (board.board[column][hauteur] == 1 || board.board[column][hauteur] == 2);

                // On place le pion à la bonne hauteur, bonne ligne
                board.board[column][hauteur] = 1;
//                v.addPawn(board.board);
                player1.setPawn_nb(player1.getPawn_nb() - 1); // On retire un pion

                // Vérification si joueur 2 à gagné horizontalement
                for (i = 0; i < 6; i++) {
                    for (ii = 0; ii < 4; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[(ii + 1)][i];
                        pawn3 = board.board[(ii + 2)][i];
                        pawn4 = board.board[(ii + 3)][i];

                        if (pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl1_win = true;
                        }
                    }
                }

                // Vérification si joueur 2 à 4 pions alignés verticalement
                for (i = 0; i < 3; i++) {
                    for (ii = 0; ii < 7; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[ii][(i + 1)];
                        pawn3 = board.board[ii][(i + 2)];
                        pawn4 = board.board[ii][(i + 3)];

                        if (pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl1_win = true;
                        }
                    }
                }

                // Vérification si joueur 2 à 4 pions alignés en diagonale "\"
                for (i = 0; i < 3; i++) {
                    for (ii = 0; ii < 4; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[(ii + 1)][(i + 1)];
                        pawn3 = board.board[(ii + 2)][(i + 2)];
                        pawn4 = board.board[(ii + 3)][(i + 3)];

                        if (pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl1_win = true;
                        }
                    }
                }

                // Vérification si joueur 1 à 4 pions alignés en diagonale "/"
                for (i = 5; i > 2; i--) {
                    for (ii = 0; ii < 3; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[(ii + 1)][(i - 1)];
                        pawn3 = board.board[(ii + 2)][(i - 2)];
                        pawn4 = board.board[(ii + 3)][(i - 3)];

                        if (pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl1_win = true;
                        }
                    }
                }
            }
            else {

                column = c.getColumn();

                // On vérifie la hauteur de la colonne
                hauteur = 6;

                do {

                    hauteur--;

                } while( board.board[column][hauteur] == 1 || board.board[column][hauteur] == 2 );

                // On place le pion à la bonne hauteur, bonne ligne
                board.board[column][hauteur] = 2;
                player2.setPawn_nb(player2.getPawn_nb() - 1); // On retire un pion

                // Vérification si joueur 2 à 4 pions alignés horizontalement
                for (i = 0; i < 6; i++) {
                    for (ii = 0; ii < 4; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[(ii+1)][i];
                        pawn3 = board.board[(ii+2)][i];
                        pawn4 = board.board[(ii+3)][i];

                        if( pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl2_win = true;
                        }
                    }
                }

                // Vérification si joueur 2 à 4 pions alignés verticalement
                for (i = 0; i < 3; i++) {
                    for (ii = 0; ii < 7; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[ii][(i+1)];
                        pawn3 = board.board[ii][(i+2)];
                        pawn4 = board.board[ii][(i+3)];

                        if( pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl2_win = true;
                        }
                    }
                }

                // Vérification si joueur 2 à 4 pions alignés en diagonale "\"
                for (i = 0; i < 3; i++) {
                    for (ii = 0; ii < 4; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[(ii+1)][(i+1)];
                        pawn3 = board.board[(ii+2)][(i+2)];
                        pawn4 = board.board[(ii+3)][(i+3)];

                        if( pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl2_win = true;
                        }
                    }
                }

                // Vérification si joueur 2 à 4 pions alignés en diagonale "/"
                for (i = 5; i > 2; i--) {
                    for (ii = 0; ii < 3; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[(ii+1)][(i-1)];
                        pawn3 = board.board[(ii+2)][(i-2)];
                        pawn4 = board.board[(ii+3)][(i-3)];

                        if( pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl2_win = true;
                        }
                    }
                }

            }

            if ( pl2_win ) {
                System.out.println(player2.getName() + " a gagné !");
                break;
            } else if ( pl1_win ) {
                System.out.println(player1.getName() + " a gagné !");
                break;
            }

        } while( manche != 42 );

        /**
        // Variables
        Scanner scanner = new Scanner(System.in);
        Board board = new Board(); // Initialisation du plateau
        String name; // Nom du joueur
        int column; // Colonne du plateau
        int hauteur = 0; // Compte la hauteur de la colonne de pion
        int i = 0; // Variable d'incrémentation
        int ii = 0; // Variable d'incrémentation
        int manche = 0; // Compteur du nombre de tour de la partie
        int pawn1, pawn2, pawn3, pawn4; // Pions pour vérifier s'il y un puissance 4
        boolean pl1_win = false; // Pour dire que joueur1 a gagné
        boolean pl2_win = false; // Pour dire que joueur2 a gagné

        // Initialisation du joueur 1
        System.out.println("Entrer le nom du joueur 1 :");
        name = scanner.nextLine();
        Player player1 = new Player(name);

        // Initialisation du joueur 2
        System.out.println("Entrer le nom du joueur 2 :");
        name = scanner.nextLine();
        Player player2 = new Player(name);

        // Début de la partie
        do {
            manche++; // On incrémente le compteur de manche

            // On affiche le plateau
            for (i = 0; i < 6; i++) {
                System.out.println("");
                for (ii = 0; ii < 7; ii++) {
                    System.out.print("|");
                    System.out.print(board.board[ii][i]);
                }
                System.out.print("|");
            }

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

                // Vérification si joueur 2 à gagné horizontalement
                for (i = 0; i < 6; i++) {
                    for (ii = 0; ii < 4; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[(ii+1)][i];
                        pawn3 = board.board[(ii+2)][i];
                        pawn4 = board.board[(ii+3)][i];

                        if( pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl1_win = true;
                        }
                    }
                }

                // Vérification si joueur 2 à 4 pions alignés verticalement
                for (i = 0; i < 3; i++) {
                    for (ii = 0; ii < 7; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[ii][(i+1)];
                        pawn3 = board.board[ii][(i+2)];
                        pawn4 = board.board[ii][(i+3)];

                        if( pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl1_win = true;
                        }
                    }
                }

                // Vérification si joueur 2 à 4 pions alignés en diagonale "\"
                for (i = 0; i < 3; i++) {
                    for (ii = 0; ii < 4; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[(ii+1)][(i+1)];
                        pawn3 = board.board[(ii+2)][(i+2)];
                        pawn4 = board.board[(ii+3)][(i+3)];

                        if( pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl1_win = true;
                        }
                    }
                }

                // Vérification si joueur 1 à 4 pions alignés en diagonale "/"
                for (i = 5; i > 2; i--) {
                    for (ii = 0; ii < 3; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[(ii+1)][(i-1)];
                        pawn3 = board.board[(ii+2)][(i-2)];
                        pawn4 = board.board[(ii+3)][(i-3)];

                        if( pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl1_win = true;
                        }
                    }
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

                // Vérification si joueur 2 à 4 pions alignés horizontalement
                for (i = 0; i < 6; i++) {
                    for (ii = 0; ii < 4; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[(ii+1)][i];
                        pawn3 = board.board[(ii+2)][i];
                        pawn4 = board.board[(ii+3)][i];
                        
                        if( pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl2_win = true;
                        }
                    }
                }

                // Vérification si joueur 2 à 4 pions alignés verticalement
                for (i = 0; i < 3; i++) {
                    for (ii = 0; ii < 7; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[ii][(i+1)];
                        pawn3 = board.board[ii][(i+2)];
                        pawn4 = board.board[ii][(i+3)];

                        if( pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl2_win = true;
                        }
                    }
                }

                // Vérification si joueur 2 à 4 pions alignés en diagonale "\"
                for (i = 0; i < 3; i++) {
                    for (ii = 0; ii < 4; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[(ii+1)][(i+1)];
                        pawn3 = board.board[(ii+2)][(i+2)];
                        pawn4 = board.board[(ii+3)][(i+3)];

                        if( pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl2_win = true;
                        }
                    }
                }

                // Vérification si joueur 2 à 4 pions alignés en diagonale "/"
                for (i = 5; i > 2; i--) {
                    for (ii = 0; ii < 3; ii++) {

                        pawn1 = board.board[ii][i];
                        pawn2 = board.board[(ii+1)][(i-1)];
                        pawn3 = board.board[(ii+2)][(i-2)];
                        pawn4 = board.board[(ii+3)][(i-3)];

                        if( pawn1 == pawn2 && pawn2 == pawn3 && pawn3 == pawn4 && pawn1 != 0) {
                            pl2_win = true;
                        }
                    }
                }

                System.out.println("");
            }

            if ( pl2_win ) {
                System.out.println(player2.getName() + " a gagné !");
                break;
            } else if ( pl1_win ) {
                System.out.println(player1.getName() + " a gagné !");
                break;
            }

        } while( manche != 42 );
        */

    }
}