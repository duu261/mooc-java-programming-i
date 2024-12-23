
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num > 0) {
                sum += num;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the avarage");
        } else {
            System.out.println(1.0 * sum / count);
        }
        scanner.close();
    }
}
