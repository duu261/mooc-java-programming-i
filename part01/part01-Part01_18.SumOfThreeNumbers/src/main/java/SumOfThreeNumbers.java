
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        int firstNum, secondNum, thirdNum;

        System.out.println("Give the first number: ");
        firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        secondNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        thirdNum = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (firstNum + secondNum + thirdNum));

        scanner.close();
    }
}
