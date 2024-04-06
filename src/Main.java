import Controller.controller;
import Modele.modele;
import View.menu;

public class Main {
    public static void main(String[] args) {

        menu v = new menu();
        modele m = new modele();
        controller c = new controller(v, m);

    }
}