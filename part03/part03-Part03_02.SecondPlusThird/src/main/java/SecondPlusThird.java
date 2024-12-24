import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        // NOTE: The program is allowed to malfunction
        while (true) {
            int input = Integer.parseInt(sc.nextLine());
            if (input == 0) {
                break;
            }
            numList.add(input);
        }
        sc.close();
        System.out.println(numList.get(2 - 1) + numList.get(3 - 1));
    }
}
