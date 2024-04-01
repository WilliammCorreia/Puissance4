package View;

import javax.swing.*;
import java.awt.*;

public class view {

    private JFrame window;
    private JPanel header;
    private JPanel board;

    public view() {

        window = new JFrame("Puissance 4");
        window.setLayout(null);

        header = new JPanel();
        header.setBounds(0, 0, 710, 100 );
        header.setBackground(Color.gray);

        board = new JPanel() {

            @Override
            public void paintComponent(Graphics g) {

                super.paintComponent(g);
                for (int i = 0; i < 6; i++) {
                    for (int ii = 0; ii < 7; ii++) {

                        g.setColor(Color.white);
                        g.fillOval(ii*100+10, i*100+10, 90, 90);
                    }
                }
            }
        };

        board.setBounds(0, 100, 710, 610);
        board.setBackground(Color.white.darker());

        window.add(header);
        window.add(board);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(200, 100, 726, 749);
        window.setVisible(true);


    }

    // Getter
    public JPanel getBoard() {
        return this.board;
    }
}
