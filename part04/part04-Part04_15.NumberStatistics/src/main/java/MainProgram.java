
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// you can write test code here
		// however, remove all unnecessary code when doing the final parts of the exercise

		// In order for the tests to work, the objects must be created in the
		// correct order in the main program. First the object that tracks the total
		// sum, secondly the object that tracks the sum of even numbers, 
		// and lastly the one that tracks the sum of odd numbers!
		Statistics sum = new Statistics();
		Statistics sumEven = new Statistics();
		Statistics sumOdd = new Statistics();
		System.out.println("Enter numbers:");
		int inputNum = 0;
		while (true) {
			inputNum = Integer.parseInt(scanner.nextLine());
			if (inputNum == -1) {
				break;
			}
			sum.addNumber(inputNum);
			if (inputNum % 2 == 0) {
				sumEven.addNumber(inputNum);
			} else {
				sumOdd.addNumber(inputNum);
			}

		}
		System.out.println("Sum: " + sum.sum());
		System.out.println("Sum of even numbers: " + sumEven.sum());
		System.out.println("Sum of odd numbers: " + sumOdd.sum());

	}
}
