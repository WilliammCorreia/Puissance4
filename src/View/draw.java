package View;

import javax.swing.*;
import java.awt.*;

public class draw {

    private JDialog popup;
    private JLabel main;

    public draw(JFrame window) {

        popup = new JDialog(window, "Fin de la partie", true);
        popup.setLayout(new FlowLayout());

        main = new JLabel("Égalité !");

        popup.add(main);

        popup.setSize(200, 100);
        popup.setLocationRelativeTo(window);
        popup.setVisible(true);

    }

}
