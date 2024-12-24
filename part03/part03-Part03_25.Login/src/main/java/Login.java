
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = { "alex", "emma" };
        String[] passwords = { "sunshine", "haskell" };
        System.out.print("Enter username: ");
        String inputUser = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPass = scanner.nextLine();
        scanner.close();

        boolean check = false;
        for (int i = 0; i < usernames.length; i++) {
            if (inputUser.equals(usernames[i]) && inputPass.equals(passwords[i])) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (check) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
