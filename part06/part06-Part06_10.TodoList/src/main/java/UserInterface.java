import java.util.Scanner;

public class UserInterface {

    private TodoList todoLists;
    private Scanner sc;

    public UserInterface(TodoList todoLists, Scanner sc) {
        this.todoLists = todoLists;
        this.sc = sc;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String cmd = sc.nextLine();
            if (cmd.equals("stop")) {
                break;
            }
            cmdProgess(cmd);

        }
    }

    public void cmdProgess(String cmd) {
        switch (cmd) {
            case "add":
                add();
                break;

            case "remove":
                remove();
                break;

            case "list":
                list();
                break;

            default:
                break;
        }
    }

    public void add() {
        System.out.print("To add: ");
        String toAdd = sc.nextLine();
        todoLists.add(toAdd);
    }

    public void list() {
        todoLists.print();
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int removeIndex = Integer.parseInt(sc.nextLine());
        todoLists.remove(removeIndex);
    }
}
