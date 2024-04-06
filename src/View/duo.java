package View;

import javax.swing.*;
import java.awt.*;

public class duo {

    private JFrame window;
    private JLabel title;
    private JTextField nameJ1;
    private JTextField nameJ2;
    private JButton submit;

    public duo() {
        window = new JFrame("Puissance 4 || Duo");
        window.setLayout(null);

        title = new JLabel("Entrer le nom des joueurs :");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(50, 25, 400, 30);

        nameJ1 = new JTextField("Nom du joueur 1");
        nameJ1.setBounds(50, 75, 400, 30);

        nameJ2 = new JTextField("Nom du joueur 2");
        nameJ2.setBounds(50, 125, 400, 30);

        submit = new JButton("Jouer !");
        submit.setFont(new Font("Arial", Font.BOLD, 20));
        submit.setBounds(150, 175, 200, 40);

        window.add(title);
        window.add(nameJ1);
        window.add(nameJ2);
        window.add(submit);

        window.setSize(500, 300);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    // Getter
    public JTextField getNameJ1() {
        return nameJ1;
    }

    public JTextField getNameJ2() {
        return nameJ2;
    }

    public JButton getSubmit() {
        return submit;
    }

    public JFrame getWindow() {
        return window;
    }

    public static void main(String[] args) {
        new duo();
    }
}
