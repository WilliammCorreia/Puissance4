package View;

import javax.swing.*;
import java.awt.*;

public class view {

    private JFrame window;
    private JPanel header;
    private JPanel board;
    private int[][] matrice;

    public view() {

        matrice = new int[7][6];

        window = new JFrame("Puissance 4");
        window.setLayout(null);

        header = new JPanel();
        header.setBounds(0, 0, 710, 70 );
        header.setBackground(Color.gray);

        board = new JPanel() {

            @Override
            public void paintComponent(Graphics g) {

                super.paintComponent(g);
                for (int i = 0; i < 6; i++) {
                    for (int ii = 0; ii < 7; ii++) {

                        if ( matrice[ii][i] == 0 ) {
                            g.setColor(Color.white);
                            g.fillOval(ii*100+10, i*100+10, 90, 90);
                        }
                        else if ( matrice[ii][i] == 1 ) {
                            g.setColor(Color.yellow);
                            g.fillOval(ii*100+10, i*100+10, 90, 90);
                        }
                        else if ( matrice[ii][i] == 2 ) {
                            g.setColor(Color.red);
                            g.fillOval(ii*100+10, i*100+10, 90, 90);
                        }
                    }
                }
            }
        };

        board.setBounds(0, 70, 710, 610);
        board.setBackground(Color.white.darker());

        window.add(header);
        window.add(board);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(200, 100, 726, 719);
        window.setVisible(true);

    }

    // Getter
    public JPanel getBoard() {
        return this.board;
    }

    public JFrame getWindow() {
        return this.window;
    }

    // Setter
    public void setMatrice(int[][] newMatrice) {
        matrice = newMatrice;
        this.board.repaint();
    }
}
