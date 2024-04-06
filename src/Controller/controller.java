package Controller;

import View.*;
import Modele.modele;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {

    public view view;
    public int column;
    public winScreen popUp;
    public menu menu;
    public duo duo;
    public solo solo;

    public controller(menu v,modele board) {

        this.menu = v;

        // Mode de jeu seul
        this.menu.getSolo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                solo = new solo();

                solo.getSubmit().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        board.setPlayer1Name(solo.getNameJ1().getText());
                        board.setPlayer2Name(solo.getNameJ2().getText());

                        view = new view(solo.getNameJ1().getText());

                        view.getBoard().addMouseListener(new MouseAdapter() {
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
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ2().getText());
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
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ2().getText());
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
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ2().getText());
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
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ2().getText());
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
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ2().getText());
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
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ2().getText());
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
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ2().getText());
                                    }

                                }

                                if (board.isPl1_win()) {

                                }
                                else {

                                    // Tour de IA Dark Vador
                                    board.setManche();
                                    view.setName(board.returnName());
                                    board.addPawn(board.columAI());
                                    board.showBoard();
                                    view.setMatrice(board.getBoard());
                                    board.verifWin(board.getBoard());

                                    if (board.isPl1_win()) {
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), solo.getNameJ2().getText());
                                    }
                                }

                            }
                        });

                        solo.getWindow().dispose();
                    }
                });

                menu.getWindow().dispose();
            }
        });

        // Mode de jeu à 2
        this.menu.getDuo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                duo = new duo();

                duo.getSubmit().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        board.setPlayer1Name(duo.getNameJ1().getText());
                        board.setPlayer2Name(duo.getNameJ2().getText());

                        view = new view(duo.getNameJ1().getText());

                        view.getBoard().addMouseListener(new MouseAdapter() {
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
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ2().getText());
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
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ2().getText());
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
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ2().getText());
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
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ2().getText());
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
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ2().getText());
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
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ2().getText());
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
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ1().getText());
                                    }
                                    else if (board.isPl2_win()) {
                                        popUp = new winScreen(view.getWindow(), duo.getNameJ2().getText());
                                    }

                                }
                            }
                        });

                        duo.getWindow().dispose();
                    }
                });

                menu.getWindow().dispose();
            }
        });

        this.menu.getQuit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
    }

    // Getter
    public int getColumn() {
        return this.column;
    }

}
