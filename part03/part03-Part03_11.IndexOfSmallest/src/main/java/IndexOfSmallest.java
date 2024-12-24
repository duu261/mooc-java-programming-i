
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;

        ArrayList<Integer> nList = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            nList.add(input);
            if (input < smallest) {
                smallest = input;
            }
        }
        scanner.close();
        System.out.println("\nSmallest number: " + smallest);
        for (int i = 0; i < nList.size(); i++) {
            if (nList.get(i) == smallest) {
                System.out.println("Found at index: " + i);

            }
        }
        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

    }
}
