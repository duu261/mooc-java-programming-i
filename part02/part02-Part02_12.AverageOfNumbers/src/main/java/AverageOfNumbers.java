
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0;
        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }
        System.out.println("Average of the numbers: " + 1.0 * sum / count);
        scanner.close();
    }
}
