
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String input = " ";
        while (!input.isEmpty()) {
            input = scanner.nextLine();
            String[] split = input.split(",");
            if (split.length < 2) {
                continue;
            }
            int currentAge = Integer.valueOf(split[1]);
            if (currentAge > oldestAge) {
                oldestAge = currentAge;
            }
        }
        System.out.println("Age of the oldest: " + oldestAge);
        scanner.close();

    }
}
