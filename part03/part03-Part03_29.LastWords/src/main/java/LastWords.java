
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = " ";
        while (!input.isEmpty()) {
            input = scanner.nextLine();
            String[] split = input.split(" ");
            System.out.println(split[split.length - 1]);
        }
        scanner.close();

    }
}
