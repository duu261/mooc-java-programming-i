
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int num1, num2;
        System.out.println("Give the first number:");
        num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        num2 = Integer.valueOf(scanner.nextLine());
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        scanner.close();
    }
}
