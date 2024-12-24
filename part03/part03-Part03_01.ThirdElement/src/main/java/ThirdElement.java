import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                break;
            }
            list.add(input);
        }
        sc.close();
        System.out.println(list.get(3 - 1));
    }
}
