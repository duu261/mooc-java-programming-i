import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JokeManager jManager = new JokeManager();
        UserInterface ui = new UserInterface(jManager, sc);
        ui.start();
    }
}
