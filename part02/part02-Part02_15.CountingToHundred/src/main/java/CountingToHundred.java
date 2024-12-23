
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // NOTE: You can assume that the user always gives a number less than 100.
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = num; i <= 100; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
