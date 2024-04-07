package View;

import javax.swing.*;
import java.awt.*;

public class view {

    private JFrame window;
    private JPanel header;
    private JLabel name;
    private JPanel board;
    private int[][] matrice;
    private int manche;

    public view(String nameP1) {

        matrice = new int[7][6];

        window = new JFrame("Puissance 4");
        window.setLayout(null);

        header = new JPanel();
        header.setBounds(0, 0, 710, 70 );
        header.setBackground(Color.gray);

        name = new JLabel(nameP1);
        name.setHorizontalAlignment(JLabel.CENTER);
        header.setLayout(new FlowLayout(FlowLayout.CENTER));
        name.setFont(new Font("Arial", Font.BOLD, 32));
        header.add(name);

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

        window.setSize(726, 719);
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }

    // Methods

    // Récupérer le nom de la personne qui joue la manche
    public void setName(String text) {
        name.setText(text);

        if( manche % 2 != 0) {
            name.setForeground(Color.yellow);
        }
        else {
            name.setForeground(Color.red);
        }

        header.add(name);
        header.revalidate();
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

    public void setManche() {
        this.manche += 1;
    }

}
