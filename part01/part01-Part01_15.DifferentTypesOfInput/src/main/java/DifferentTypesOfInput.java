
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        String aString;
        int intNumber;
        double doubleNumber;
        boolean boo;

        System.out.println("Give a string: ");
        aString = scan.nextLine();
        System.out.println("Give an integer: ");
        intNumber = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        doubleNumber = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boo = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + aString);
        System.out.println("You gave the integer " + intNumber);
        System.out.println("You gave the double " + doubleNumber);
        System.out.println("You gave the boolean " + boo);

        scan.close();
    }
}
