package View;

import javax.swing.*;
import java.awt.*;

public class view {

    JFrame window;
    JPanel header;
    JPanel board;

    JButton[][] matrice;

    public view() {

        window = new JFrame("Puissance 4");
        window.setLayout(null);

        header = new JPanel();
        header.setBounds(0, 0, 700, 100 );
        header.setBackground(Color.gray);

        board = new JPanel();
        board.setSize(700, 600);
        board.setBackground(Color.pink);

        window.add(header);
        window.add(board);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(700, 700);
        window.setVisible(true);
    }
}
