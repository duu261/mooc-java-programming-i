
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here

        int firstNum, secondNum;

        System.out.println("Give the first number: ");
        firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        secondNum = Integer.valueOf(scanner.nextLine());
        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));

        scanner.close();

    }
}
