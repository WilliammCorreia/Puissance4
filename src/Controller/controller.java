package Controller;

import View.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class controller {

    public view view;

    public controller(view view) {
        this.view.getBoard().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getX() >= 0 && e.getX() <= 110 && e.getY() >= 0 && e.getY() <= 610) {
                    System.out.println("Cliqué à : " + e.getX() + ", " + e.getY());
                }
            }
        });
    }
}
