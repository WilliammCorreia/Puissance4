package View;

import javax.swing.*;
import java.awt.*;

public class duo {

    JFrame window;
    JLabel title;
    JTextField nameJ1;
    JTextField nameJ2;
    JButton submit;

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

    public static void main(String[] args) {
        new duo();
    }
}
