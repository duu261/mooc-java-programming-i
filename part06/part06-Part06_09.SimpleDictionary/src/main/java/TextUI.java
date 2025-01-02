import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public SimpleDictionary getSimpleDictionary() {
        return simpleDictionary;
    }

    public void setSimpleDictionary(SimpleDictionary simpleDictionary) {
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            this.cmdProgress(command);
        }
        System.out.println("Bye bye!");
    }

    public void cmdProgress(String command) {
        if (command.equals("add")) {
            this.add();
        } else if (command.equals("search")) {
            this.search();
        } else {
            System.out.println("Unknow command");
        }

    }

    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        this.simpleDictionary.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String trans = scanner.nextLine();
        if (this.simpleDictionary.translate(trans) == null) {
            System.out.println("Word " + trans + " was not found");
        } else {
            System.out.println("Translation: " + this.simpleDictionary.translate(trans));
        }
    }

}
