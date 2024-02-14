import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Initialisation du joueur 1
        System.out.println("Entrer le nom du joueur 1 :");
        String name = scanner.nextLine();

        Player player1 = new Player(name);


    }
}