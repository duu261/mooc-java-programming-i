
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int num1, num2, num3;
        double avg;
        System.out.println("Give the first number:");
        num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        num2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        num3 = Integer.valueOf(scanner.nextLine());
        avg = (1.0 * num1 + num2 + num3) / 3;
        System.out.println("The average is " + avg);
        scanner.close();

    }
}
