package View;

import javax.swing.*;
import java.awt.*;

public class winScreen {

    private JDialog popup;
    private JLabel main;

    public winScreen(JFrame window, String name) {

        popup = new JDialog(window, "Victoire", true);
        popup.setLayout(new FlowLayout());

        main = new JLabel(name + " a gagné !");

        popup.add(main);

        popup.setSize(200, 100);
        popup.setLocationRelativeTo(window);
        popup.setVisible(true);

    }

}
