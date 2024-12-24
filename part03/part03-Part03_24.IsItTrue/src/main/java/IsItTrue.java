
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // final String ANSWER = "true";
        // tmc not accpect final captital..
        final String answer = "true";
        System.out.print("Give a string: ");
        String input = scanner.nextLine();
        scanner.close();
        if (input.equals(answer)) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
