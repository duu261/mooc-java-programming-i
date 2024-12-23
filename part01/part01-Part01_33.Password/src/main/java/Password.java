
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // final String CORRECT_PASSWORD = "Caput Draconis";
        // tmcbeans does not accpect capital final var name?
        final String correctPassword = "Caput Draconis";
        String password;
        // Write your program here
        System.out.println("Password? ");
        password = scan.nextLine();
        if (password.equals(correctPassword)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
        scan.close();
    }
}
