
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int factorial = 1;
        while (true) {
            System.out.print("Give a number: ");
            num = Integer.parseInt(scanner.nextLine());
            if (num < 0) {
                continue;
            }
            break;
        }
        scanner.close();

        if (num != 0) {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }
        System.out.print("Factorial: " + factorial);

    }
}
