package View;

import javax.swing.*;
import java.awt.*;

public class menu {

    private JFrame window;
    private JLabel title;
    private JButton solo;
    private JButton duo;
    private JButton quit;

    public menu() {
        window = new JFrame("Puissance 4 || Menu");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        title = new JLabel("Jouer en solo ou en duo ?");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(125, 25, 400, 30);

        solo = new JButton("SOLO");
        solo.setFont(new Font("Arial", Font.BOLD, 20));
        solo.setBounds(75, 75, 150, 50);

        duo = new JButton("DUO");
        duo.setFont(new Font("Arial", Font.BOLD, 20));
        duo.setBounds(275, 75, 150, 50);

        quit = new JButton("Quitter");
        quit.setFont(new Font("Arial", Font.BOLD, 14));
        quit.setBounds(200, 175, 100, 25);

        // Ajouter les composants directement au JFrame
        window.add(title);
        window.add(solo);
        window.add(duo);
        window.add(quit);

        window.setSize(500, 250);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    // Getter
    public JButton getSolo() {
        return solo;
    }

    public JButton getDuo() {
        return duo;
    }

    public JButton getQuit() {
        return quit;
    }

    public JFrame getWindow() {
        return window;
    }

}
