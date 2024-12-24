
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = " ";
        String oldestName = "";
        int oldestAge = 0;
        while (!input.isEmpty()) {
            input = scanner.nextLine();
            String[] split = input.split(",");
            if (split.length < 2) {
                continue;
            }
            String currentName = split[0];
            int currentAge = Integer.valueOf(split[1]);
            if (currentAge > oldestAge) {
                oldestAge = currentAge;
                oldestName = currentName;
            }
        }
        System.out.println("Name of the oldest: " + oldestName);

        scanner.close();

    }
}
