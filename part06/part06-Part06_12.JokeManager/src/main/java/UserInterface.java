import java.util.Scanner;

public class UserInterface {

    private JokeManager jManager;
    private Scanner sc;

    public UserInterface(JokeManager jManager, Scanner sc) {
        this.jManager = jManager;
        this.sc = sc;
    }

    // X - ending: exits the method start.
    // 1 - adding: asks the user for the joke to be added to the joke manager, and
    // then adds it.
    // 2 - drawing: chooses a random joke from the joke manager and prints it. If
    // there are no jokes in the manager, thi string "Jokes are in short supply."
    // will be printed.
    // 3 - printing: prints all the jokes stored in the joke manager.

    public void start() {
        while (true) {
            printMenu();
            String cmd = sc.nextLine();
            if (cmd.equals("X")) {
                break;
            }
            cmdProgress(cmd);
        }
    }

    public void cmdProgress(String cmd) {
        switch (cmd) {
            case "1":
                add();
                break;
            case "2":
                draw();
                break;
            case "3":
                print();
                break;
            default:
                break;
        }
    }

    public void printMenu() {
        System.out.println("Commands: ");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }

    public void add() {
        System.out.println("Write the joke to be added:");
        String joke = sc.nextLine();
        if (!joke.isEmpty()) {
            jManager.addJoke(joke);
        }
    }

    public void draw() {
        System.out.println(jManager.drawJoke());
    }

    public void print() {
        System.out.println("Printing the jokes.");
        jManager.printJokes();
    }
}
