
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        num1 = Integer.parseInt(scanner.nextLine());
        num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(Math.sqrt(num1 + num2));
        scanner.close();
    }
}
