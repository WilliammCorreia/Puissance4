package Controller;

import View.view;
import Modele.modele;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class controller {

    public view view;
    public int column;

    public controller(view view, modele board) {

        this.view = view;

        this.view.getBoard().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getX() >= 0 && e.getX() <= 100 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 0;
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.setManche();
                    board.verifWin(board.getBoard());

                } else if (e.getX() >= 100 && e.getX() <= 200 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 1;
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.setManche();
                    board.verifWin(board.getBoard());

                } else if (e.getX() >= 200 && e.getX() <= 300 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 2;
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.setManche();
                    board.verifWin(board.getBoard());

                } else if (e.getX() >= 300 && e.getX() <= 400 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 3;
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.setManche();
                    board.verifWin(board.getBoard());

                } else if (e.getX() >= 400 && e.getX() <= 500 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 4;
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.setManche();
                    board.verifWin(board.getBoard());

                } else if (e.getX() >= 500 && e.getX() <= 600 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 5;
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.setManche();
                    board.verifWin(board.getBoard());

                } else if (e.getX() >= 600 && e.getX() <= 700 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 6;
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.setManche();
                    board.verifWin(board.getBoard());

                }
            }
        });
    }

    // Getter
    public int getColumn() {
        return this.column;
    }

}
