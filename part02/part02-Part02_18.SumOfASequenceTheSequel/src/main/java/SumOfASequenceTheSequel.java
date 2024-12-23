
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fNum, lNum;
        int sum = 0;
        System.out.print("First number? ");
        fNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Last number? ");
        lNum = Integer.parseInt(scanner.nextLine());
        while (fNum <= lNum) {
            sum += fNum;
            fNum++;
        }
        System.out.println("The sum is " + sum);
        scanner.close();
    }
}
