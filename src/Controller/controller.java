package Controller;

import View.view;
import View.winScreen;
import Modele.modele;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class controller {

    public view view;
    public int column;
    public winScreen popUp;

    public controller(view view, modele board) {

        this.view = view;



        this.view.getBoard().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getX() >= 0 && e.getX() <= 100 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 0;
                    board.setManche();
                    view.setName(board.returnName());
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.verifWin(board.getBoard());

                    if (board.isPl1_win()) {
                        popUp = new winScreen(view.getWindow(), "Jaune");
                    }
                    else if (board.isPl2_win()) {
                        popUp = new winScreen(view.getWindow(), "Rouge");
                    }

                } else if (e.getX() >= 100 && e.getX() <= 200 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 1;
                    board.setManche();
                    view.setName(board.returnName());
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.verifWin(board.getBoard());

                    if (board.isPl1_win()) {
                        popUp = new winScreen(view.getWindow(), "Jaune");
                    }
                    else if (board.isPl2_win()) {
                        popUp = new winScreen(view.getWindow(), "Rouge");
                    }

                } else if (e.getX() >= 200 && e.getX() <= 300 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 2;
                    board.setManche();
                    view.setName(board.returnName());
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.verifWin(board.getBoard());

                    if (board.isPl1_win()) {
                        popUp = new winScreen(view.getWindow(), "Jaune");
                    }
                    else if (board.isPl2_win()) {
                        popUp = new winScreen(view.getWindow(), "Rouge");
                    }

                } else if (e.getX() >= 300 && e.getX() <= 400 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 3;
                    board.setManche();
                    view.setName(board.returnName());
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.verifWin(board.getBoard());

                    if (board.isPl1_win()) {
                        popUp = new winScreen(view.getWindow(), "Jaune");
                    }
                    else if (board.isPl2_win()) {
                        popUp = new winScreen(view.getWindow(), "Rouge");
                    }

                } else if (e.getX() >= 400 && e.getX() <= 500 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 4;
                    board.setManche();
                    view.setName(board.returnName());
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.verifWin(board.getBoard());

                    if (board.isPl1_win()) {
                        popUp = new winScreen(view.getWindow(), "Jaune");
                    }
                    else if (board.isPl2_win()) {
                        popUp = new winScreen(view.getWindow(), "Rouge");
                    }

                } else if (e.getX() >= 500 && e.getX() <= 600 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 5;
                    board.setManche();
                    view.setName(board.returnName());
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.verifWin(board.getBoard());

                    if (board.isPl1_win()) {
                        popUp = new winScreen(view.getWindow(), "Jaune");
                    }
                    else if (board.isPl2_win()) {
                        popUp = new winScreen(view.getWindow(), "Rouge");
                    }

                } else if (e.getX() >= 600 && e.getX() <= 700 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                    column = 6;
                    board.setManche();
                    view.setName(board.returnName());
                    board.addPawn(column);
                    board.showBoard();
                    view.setMatrice(board.getBoard());
                    board.verifWin(board.getBoard());

                    if (board.isPl1_win()) {
                        popUp = new winScreen(view.getWindow(), "Jaune");
                    }
                    else if (board.isPl2_win()) {
                        popUp = new winScreen(view.getWindow(), "Rouge");
                    }

                }
            }
        });
    }

    // Getter
    public int getColumn() {
        return this.column;
    }

}
