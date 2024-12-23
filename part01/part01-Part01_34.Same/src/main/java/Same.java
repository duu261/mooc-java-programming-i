
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        String string1, string2;
        System.out.println("Enter the first string: ");
        string1 = scan.nextLine();
        System.out.println("Enter the second string: ");
        string2 = scan.nextLine();
        if (string1.equals(string2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        scan.close();
    }
}
