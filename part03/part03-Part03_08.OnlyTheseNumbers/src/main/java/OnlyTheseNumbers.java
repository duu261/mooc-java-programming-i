
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        int begin, end;
        System.out.print("From where? ");
        begin = Integer.parseInt(scanner.nextLine());
        System.out.print("To where? ");
        end = Integer.parseInt(scanner.nextLine());
        scanner.close();

        for (int i = begin; i <= end; i++) {
            System.out.println(numbers.get(i));

        }
    }
}
