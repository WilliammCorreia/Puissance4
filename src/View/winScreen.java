package View;

import javax.swing.*;
import java.awt.*;

public class winScreen {

    private JDialog popup;
    private JLabel main;
    private JLabel quit;

    public winScreen(JFrame window, String name) {

        popup = new JDialog(window, "Victoire", true);
        popup.setLayout(new FlowLayout());

        main = new JLabel(name + " a gagné !");

        quit = new JLabel("Vous pouvez fermer les pages.");
        quit.setFont(new Font("Arial", Font.BOLD, 10));

        popup.add(main);
        popup.add(quit);

        popup.setSize(200, 100);
        popup.setLocationRelativeTo(window);
        popup.setVisible(true);

    }

}
