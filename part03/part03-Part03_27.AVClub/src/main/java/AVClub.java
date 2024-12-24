
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = " ";
        while (!input.isEmpty()) {
            input = scanner.nextLine();
            String[] split = input.split(" ");
            for (String part : split) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }
        }
        scanner.close();

    }
}
