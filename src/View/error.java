package View;

import javax.swing.*;
import java.awt.*;

public class error {

    private JDialog popup;
    private JLabel main;

    public error(JFrame window) {

        popup = new JDialog(window, "Erreur", true);
        popup.setLayout(new FlowLayout());

        main = new JLabel("La colonne est pleine !");

        popup.add(main);

        popup.setSize(200, 100);
        popup.setLocationRelativeTo(window);
        popup.setVisible(true);
    }

}
