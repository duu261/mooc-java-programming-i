
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = " ", longestName = " ";
        double avgBYears = 0;
        int count = 0, sumYears = 0;
        while (!input.isEmpty()) {
            input = scanner.nextLine();
            String[] split = input.split(",");
            if (split.length < 2) {
                continue;
            }
            String name = split[0];
            int bYears = Integer.valueOf(split[1]);
            count++;
            sumYears += bYears;
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        avgBYears = (double) sumYears / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avgBYears);

        scanner.close();

    }
}
