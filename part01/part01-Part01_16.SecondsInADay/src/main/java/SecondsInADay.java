
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        int days;
        System.out.println("How many days would you like to convert to seconds?");
        days = Integer.valueOf(scanner.nextLine());
        System.out.println(days * 24 * 60 * 60);

        scanner.close();
    }
}
