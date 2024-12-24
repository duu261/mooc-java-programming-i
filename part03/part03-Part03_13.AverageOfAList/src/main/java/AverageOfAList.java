
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nList = new ArrayList<>();
        int input, sum = 0;
        double avg;
        while (true) {
            input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }
            nList.add(input);
            sum += input;
        }
        scanner.close();
        avg = (double) sum / nList.size();
        System.out.println("\nAverage: " + avg);
    }
}
