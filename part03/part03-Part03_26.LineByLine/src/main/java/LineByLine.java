
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = " ";
        while (!input.isEmpty()) {
            input = scanner.nextLine();
            String[] pieces = input.split(" ");
            for (String piece : pieces) {
                System.out.println(piece);
            }
        }
        scanner.close();

    }
}
