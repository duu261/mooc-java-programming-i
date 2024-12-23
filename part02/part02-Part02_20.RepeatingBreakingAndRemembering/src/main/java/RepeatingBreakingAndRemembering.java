
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        int num, sum = 0, countNum = 0, countEven = 0, countOdd = 0;
        double avg;
        System.out.println("Give numbers:");
        while (true) {
            num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            countNum++;
            sum += num;
        }
        scanner.close();
        avg = 1.0 * sum / countNum;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + countNum);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
    }
}
